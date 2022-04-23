package com.example.aula01.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aula01.R;
import com.example.aula01.model.ItemDoCarrinho;
import com.example.aula01.model.Produto;

import java.util.List;

public class AdapterItensDoCarrinho extends BaseAdapter {

    // context é a classe
    private Context context;

    // cria uma lista dos produtos cadastrados para ser exibida.
    private List<ItemDoCarrinho> itensDoCarrinho;

    // Quando instanciado terá que passar o context e a lista com os produtos cadastrados.
    public AdapterItensDoCarrinho(Context context, List<ItemDoCarrinho> itensDoCarrinho) {
        this.context = context;
        this.itensDoCarrinho = itensDoCarrinho;
    }

    // metodo que passa o tamanho da list
    @Override
    public int getCount() {
        return this.itensDoCarrinho.size();
    }

    // metodo que pega informação sobre algum intem da lista
    @Override
    public Object getItem(int posicao) {
        return this.itensDoCarrinho.get(posicao);
    }

    // metodo que pega o id de algum intem da lista
    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    public boolean removerItemDoCarrinho(int posicao){
        this.itensDoCarrinho.remove(posicao);
        this.notifyDataSetChanged();

        return true;
    }

    public void alterarProduto(List<ItemDoCarrinho> pItensDoCarrinho){
        this.itensDoCarrinho.clear();
        this.itensDoCarrinho = pItensDoCarrinho;
        this.notifyDataSetChanged();
    }

    public void addItemNoCarrinho(ItemDoCarrinho pItemdoCarrinho){
            this.itensDoCarrinho.add(pItemdoCarrinho);
            this.notifyDataSetChanged();

    }

    //Recebe os dados da lista e repassa para o usuario.
    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View v = View.inflate(this.context, R.layout.layout_carrinho_produtos, null);

        TextView txvNomeProduto = (TextView) v.findViewById(R.id.txvNomeProduto);
        TextView txvPreco = (TextView) v.findViewById(R.id.txvPreco);
        TextView txvQtdProduto = (TextView) v.findViewById(R.id.txvQtdProduto);
        TextView txvValorTotal = (TextView) v.findViewById(R.id.txvValorTotal);

        txvNomeProduto.setText(this.itensDoCarrinho.get(posicao).getNome());
        txvPreco.setText(String.valueOf(this.itensDoCarrinho.get(posicao).getPreco()));
        txvQtdProduto.setText(String.valueOf(this.itensDoCarrinho.get(posicao).getQuantidadeSelecionada()));
        txvValorTotal.setText(String.valueOf(this.itensDoCarrinho.get(posicao).getValorTotal()));
        
        return v;
    }
}
