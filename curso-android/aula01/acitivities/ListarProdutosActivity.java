package com.example.aula01.acitivities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aula01.R;
import com.example.aula01.adapters.AdapterListaProdutos;
import com.example.aula01.controller.ProdutoCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ListarProdutosActivity extends AppCompatActivity {

    private ListView lsvProdutos;
    private List<Produto> produtoList;
    private AdapterListaProdutos adapterListaProdutos;
    private ProdutoCtrl produtoCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);

        this.produtoCtrl =  new ProdutoCtrl(ConexaoSQLite.getInstance(ListarProdutosActivity.this));


        produtoList = this.produtoCtrl.getListaProdutosCtrl();

        this.lsvProdutos = (ListView) findViewById(R.id.lsvProdutos);
        this.adapterListaProdutos = new AdapterListaProdutos(ListarProdutosActivity.this, this.produtoList);
        this.lsvProdutos.setAdapter(this.adapterListaProdutos);

        this.lsvProdutos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int posicao, long l) {

                final Produto produtoSelecionado = (Produto) adapterListaProdutos.getItem(posicao);

                AlertDialog.Builder janelaDeEscolha = new AlertDialog.Builder(ListarProdutosActivity.this);

                janelaDeEscolha.setTitle("Escolha: ");

                janelaDeEscolha.setMessage("O que deseja fazer com o produto cancelado? ");

                janelaDeEscolha.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                janelaDeEscolha.setNegativeButton("Excluir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      boolean excluiu = produtoCtrl.excluirProdutoCtrl(produtoSelecionado.getId());


                        if (excluiu == true){

                            adapterListaProdutos.removerProduto(posicao);

                            Toast.makeText(ListarProdutosActivity.this,
                                    "Produto Excluido com sucesso.", Toast.LENGTH_LONG).show();

                        }else{
                            Toast.makeText(ListarProdutosActivity.this,
                                    "Não foi possivel excluir o produto.", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                janelaDeEscolha.setPositiveButton("Editar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Bundle bundleDadosProdutos = new Bundle();

                        bundleDadosProdutos.putLong("id_produto", produtoSelecionado.getId());
                        bundleDadosProdutos.putString("nome_produto", produtoSelecionado.getNome());
                        bundleDadosProdutos.putInt("qtd_produto", produtoSelecionado.getQuantidadeEmEstoque());
                        bundleDadosProdutos.putDouble("preco_produto", produtoSelecionado.getPreco());

                        Intent intentEditarProdutos = new Intent(ListarProdutosActivity.this, AlterarProdutosActivity.class);
                        intentEditarProdutos.putExtras(bundleDadosProdutos);
                        startActivity(intentEditarProdutos);
                    }
                });

                janelaDeEscolha.create().show();
            }
        });

    }

    public void eventAtulizasLista(View view)
    {
        this.adapterListaProdutos.alterarProduto(this.produtoCtrl.getListaProdutosCtrl());
    }

}