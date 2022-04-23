package com.example.aula01.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aula01.R;
import com.example.aula01.acitivities.ListarProdutosActivity;
import com.example.aula01.controller.ProdutoCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

import java.util.List;

public class AdapterListaProdutos extends BaseAdapter {

    // context é a classe
    private Context context;

    // cria uma lista dos produtos cadastrados para ser exibida.
    private List<Produto> produtoList;

    // Quando instanciado terá que passar o context e a lista com os produtos cadastrados.
    public AdapterListaProdutos(Context context, List<Produto> produtoList) {
        this.context = context;
        this.produtoList = produtoList;
    }

    // metodo que passa o tamanho da list
    @Override
    public int getCount() {
        return this.produtoList.size();
    }

    // metodo que pega informação sobre algum intem da lista
    @Override
    public Object getItem(int posicao) {
        return this.produtoList.get(posicao);
    }

    // metodo que pega o id de algum intem da lista
    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    public void removerProduto(int posicao){
        this.produtoList.remove(posicao);
        notifyDataSetChanged();
    }

    public void alterarProduto(List<Produto> produto){
        this.produtoList.clear();
        this.produtoList = produto;
        notifyDataSetChanged();
    }

    //Recebe os dados da lista e repassa para o usuario.
    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View v = View.inflate(this.context, R.layout.layout_produto, null);

        TextView tvNomeProduto = (TextView) v.findViewById(R.id.tvNomeProduto);
        TextView tvPrecoProduto = (TextView) v.findViewById(R.id.tvPrecoProduto);
        TextView tvQtdProduto = (TextView) v.findViewById(R.id.tvQtdProduto);

        tvNomeProduto.setText(this.produtoList.get(posicao).getNome());
        tvPrecoProduto.setText(String.valueOf(this.produtoList.get(posicao).getPreco()));
        tvQtdProduto.setText(String.valueOf(this.produtoList.get(posicao).getQuantidadeEmEstoque()));

        return v;
    }
}
