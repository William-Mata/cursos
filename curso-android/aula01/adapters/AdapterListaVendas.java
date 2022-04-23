package com.example.aula01.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aula01.R;
import com.example.aula01.model.Produto;
import com.example.aula01.model.Venda;

import java.text.SimpleDateFormat;
import java.util.List;

public class AdapterListaVendas extends BaseAdapter {

    // context é a classe
    private Context context;

    // cria uma lista dos produtos cadastrados para ser exibida.
    private List<Venda> vendaList;

    private SimpleDateFormat simpleDateFormat;

    // Quando instanciado terá que passar o context e a lista com os produtos cadastrados.
    public AdapterListaVendas(Context context, List<Venda> vendaList) {
        this.context = context;
        this.vendaList = vendaList;
        this.simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
    }

    // metodo que passa o tamanho da list
    @Override
    public int getCount() {
        return this.vendaList.size();
    }

    // metodo que pega informação sobre algum intem da lista
    @Override
    public Object getItem(int posicao) {
        return this.vendaList.get(posicao);
    }

    // metodo que pega o id de algum intem da lista
    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    public void alterarVenda(List<Venda> venda){
        this.vendaList.clear();
        this.vendaList = venda;
        notifyDataSetChanged();
    }

    //Recebe os dados da lista e repassa para o usuario.
    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View v = View.inflate(this.context, R.layout.layout_relatoriovendas, null);

        TextView txvDataVenda = (TextView) v.findViewById(R.id.txvDataVenda);
        TextView txvTotalVenda = (TextView) v.findViewById(R.id.txvTotalVenda);
        TextView txvQtdIntens = (TextView) v.findViewById(R.id.txvQtdIntens);

        txvDataVenda.setText(this.simpleDateFormat.format(this.vendaList.get(posicao).getDataDaVenda()));
        txvTotalVenda.setText(String.valueOf(this.vendaList.get(posicao).getTotalVenda()));
        txvQtdIntens.setText(String.valueOf(this.vendaList.get(posicao).getQtdItens()));

        return v;
    }
}
