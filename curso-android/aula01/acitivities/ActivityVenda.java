package com.example.aula01.acitivities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aula01.R;
import com.example.aula01.adapters.AdapterItensDoCarrinho;
import com.example.aula01.adapters.AdapterListaProdutos;
import com.example.aula01.controller.ProdutoCtrl;
import com.example.aula01.controller.VendaCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.ItemDoCarrinho;
import com.example.aula01.model.Produto;
import com.example.aula01.model.Venda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityVenda extends AppCompatActivity {

    private List<Produto> listaProduto;
    private ProdutoCtrl produtoCtrl;
    private Spinner spnProduto;
    private EditText editQtdProduto;
    private Button btnAddProduto;
    private Button btnFinalizarCompra;

    private ListView lsvProdutos;
    private List<ItemDoCarrinho> listItemDoCarrinho;
    private AdapterItensDoCarrinho adapterItensDoCarrinho;

    private VendaCtrl vendaCtrl;

    private TextView txvValorTotalCompra;
    private Venda venda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda);

        this.venda = new Venda();

        this.vendaCtrl = new VendaCtrl(ConexaoSQLite.getInstance(ActivityVenda.this));

        this.txvValorTotalCompra = (TextView)this.findViewById(R.id.txvValorTotalCompra);

        this.spnProduto = (Spinner)this.findViewById(R.id.spnProduto);

        this.editQtdProduto = (EditText)this.findViewById(R.id.editQtdProduto);

        this.btnAddProduto = (Button)this.findViewById(R.id.btnAddProduto);
        this.btnFinalizarCompra = (Button)this.findViewById(R.id.btnFinalizarCompra);

        this.lsvProdutos = (ListView)this.findViewById(R.id.lsvProdutos);
        this.listItemDoCarrinho = new ArrayList<>();
        this.adapterItensDoCarrinho = new AdapterItensDoCarrinho (ActivityVenda.this,
                this.listItemDoCarrinho);
        this.lsvProdutos.setAdapter(adapterItensDoCarrinho);

        // buscando os produtos no banco de dados atraves da instancia da classe produtoCtrl
        this.produtoCtrl = new ProdutoCtrl(ConexaoSQLite.getInstance(this));

        // passa todos os produtos para a list Produto.
        this.listaProduto = this.produtoCtrl.getListaProdutosCtrl();

        // criando um adpater para passar a lista de produtos para o spiner.
        ArrayAdapter<Produto> spnProdutoAdapater = new
                ArrayAdapter<Produto>(this,
                android.R.layout.simple_spinner_item, this.listaProduto);

        this.spnProduto.setAdapter(spnProdutoAdapater);


        this.lsvProdutos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int posicao, long l) {

                final ItemDoCarrinho itemDoCarrinho = (ItemDoCarrinho) adapterItensDoCarrinho.getItem(posicao);

                AlertDialog.Builder janelaDeEscolha = new AlertDialog.Builder(ActivityVenda.this);

                janelaDeEscolha.setTitle("Escolha: ");

                janelaDeEscolha.setMessage("Deseja remover o item selecionado: " + itemDoCarrinho.getNome());

                janelaDeEscolha.setNegativeButton("Não", null);

                janelaDeEscolha.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        boolean excluiu = false;

                        excluiu = adapterItensDoCarrinho.removerItemDoCarrinho(posicao);

                        if (!excluiu){



                            Toast.makeText(ActivityVenda.this,
                                    "Erro ao excluir o item selecionado!",
                                    Toast.LENGTH_LONG).show();
                        }
                        else{

                            double valorTotalVendas = calcularTotalVenda(listItemDoCarrinho);

                            atualizarTotalVenda(valorTotalVendas);

                            Toast.makeText(ActivityVenda.this,
                                    " O item selecionado foi excluido com sucesso!",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });

                janelaDeEscolha.create().show();
            }
        });

    }

    public void eventAddProduto(View view) {


        ItemDoCarrinho itemDoCarrinho = new ItemDoCarrinho();

        Produto produtoSelecionado = (Produto) this.spnProduto.getSelectedItem();

        int qtdProdutosAdd = 0;

        if (this.editQtdProduto.getText().toString().equals(""))
        {
            qtdProdutosAdd = 1;
        }
        else
            {
            qtdProdutosAdd =  Integer.parseInt(String.valueOf(this.editQtdProduto.getText()));

        }

        itemDoCarrinho.setNome(produtoSelecionado.getNome());
        itemDoCarrinho.setQuantidadeSelecionada(qtdProdutosAdd);
        itemDoCarrinho.setIdProduto(produtoSelecionado.getId());
        itemDoCarrinho.setPreco(produtoSelecionado.getPreco());
        itemDoCarrinho.setValorTotal(qtdProdutosAdd * itemDoCarrinho.getPreco());



        this.adapterItensDoCarrinho.addItemNoCarrinho(itemDoCarrinho);;

        double valorTotalVendas = this.calcularTotalVenda(listItemDoCarrinho);


        this.atualizarTotalVenda(valorTotalVendas);

        venda.setQtdItens(itemDoCarrinho.getQuantidadeSelecionada());



    }

    private double calcularTotalVenda(List<ItemDoCarrinho> itemDoCarrinho){
        double valorTotalCompras = 0.00d;


        for (ItemDoCarrinho itemDoCarrinho1: listItemDoCarrinho) {

            valorTotalCompras += itemDoCarrinho1.getValorTotal();

        }

        return  valorTotalCompras;
    }

    private void atualizarTotalVenda(double valorTotalVenda){

        this.txvValorTotalCompra.setText(String.valueOf(valorTotalVenda));


        venda.setTotalVenda(valorTotalVenda);

    }

    private Venda criarVenda() {
        Venda venda = new Venda();
        venda.setDataDaVenda(new Date());
        venda.setListItemDoCarrinho(this.listItemDoCarrinho);

        return venda;

    }

    private boolean salvarVenda(Venda pVenda){
        Log.d("VENDA", pVenda.getDataDaVenda().toString());

        long idVenda = vendaCtrl.salvarVendaCtrl(pVenda);

        if ( idVenda> 0){
            pVenda.setId(idVenda);

            if(vendaCtrl.salvarItensDaVendaCtrl(pVenda)){
                Toast.makeText(this, "Venda Realizada Com Sucesso.", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Venda não foi Realizada, tente novamente.", Toast.LENGTH_SHORT).show();

            }

            return true;
        }

        return  false;
    }

    public void eventFinalizarCompra(View view) {
        Venda vendaFinalizada = this.criarVenda();


       if (this.salvarVenda(vendaFinalizada)){
           Toast.makeText(this, "Venda Finalizada com sucesso.", Toast.LENGTH_LONG).show();
       }else {
           Toast.makeText(this, "Erro ao finalizar a venda.", Toast.LENGTH_SHORT).show();
       }

    }
}