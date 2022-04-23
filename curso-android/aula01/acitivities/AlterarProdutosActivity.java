package com.example.aula01.acitivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aula01.R;
import com.example.aula01.controller.ProdutoCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

public class AlterarProdutosActivity extends AppCompatActivity {

    Produto produto = new Produto();

    private EditText editCodigoProduto;
    private EditText editNomeProduto;
    private EditText editPreco;
    private EditText editQtdProduto;


    private Button btnAlterarProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_produtos);

        this.editCodigoProduto = (EditText) findViewById(R.id.editCodigoProduto);
        this.editNomeProduto = (EditText) findViewById(R.id.editNomeProduto);
        this.editPreco = (EditText) findViewById(R.id.editPreco);
        this.editQtdProduto = (EditText) findViewById(R.id.editQtdProduto);

        this.btnAlterarProduto = (Button) findViewById(R.id.btnAlterarProduto);

        Bundle bundleDadosProdutos = getIntent().getExtras();

        Produto produto = new Produto();

        produto.setId(bundleDadosProdutos.getLong("id_produto"));
        produto.setNome(bundleDadosProdutos.getString("nome_produto"));
        produto.setQuantidadeEmEstoque(bundleDadosProdutos.getInt("qtd_produto"));
        produto.setPreco(bundleDadosProdutos.getDouble("preco_produto"));

        this.setDadosProdutos(produto);

        this.clickNoBotaoSalvarAlteracaoListener();
    }

    private void setDadosProdutos(Produto produto){

        this.editCodigoProduto.setText(String.valueOf(produto.getId()));
        this.editNomeProduto.setText(produto.getNome());
        this.editQtdProduto.setText(String.valueOf(produto.getQuantidadeEmEstoque()));
        this.editPreco.setText(String.valueOf(produto.getPreco()));

    }

    private void clickNoBotaoSalvarAlteracaoListener(){
        this.btnAlterarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Produto produtoaAlterar = getDadosProdutoFormulario();

                if (produtoaAlterar != null){
                    ProdutoCtrl produtoCtrl = new ProdutoCtrl(ConexaoSQLite.getInstance(AlterarProdutosActivity.this));
                    boolean atualizou = produtoCtrl.alterarProdutoCtrl(produtoaAlterar);

                    if (atualizou == true){
                        Toast.makeText(AlterarProdutosActivity.this,"Produto Alterado Com Sucesso!",
                                Toast.LENGTH_LONG ).show();
                    }
                    else
                    {
                        Toast.makeText(AlterarProdutosActivity.this, "Não foi possivel realizar a alteração do produto.",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(AlterarProdutosActivity.this, "Todos os campos são Obrigatorios!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private Produto getDadosProdutoFormulario(){

        this.produto = new Produto();

        if(this.editCodigoProduto.getText().toString().isEmpty() == false){
            long codigoProduto = Long.parseLong(editCodigoProduto.getText().toString());
            this.produto.setId(codigoProduto);
        }
        else
        {
            return null;
        }

        if(this.editNomeProduto.getText().toString().isEmpty() == false){
            this.produto.setNome(this.editNomeProduto.getText().toString());
        }
        else
        {
            return null;
        }

        if (this.editQtdProduto.getText().toString().isEmpty() == false){
            int qtdProduto = Integer.parseInt(this.editQtdProduto.getText().toString());
            this.produto.setQuantidadeEmEstoque(qtdProduto);
        }
        else
        {
            return null;
        }

        if (this.editPreco.getText().toString().isEmpty() == false){
            double precoProduto = Double.parseDouble(this.editPreco.getText().toString());
            this.produto.setPreco(precoProduto);
        }
        else
        {
            return null;
        }

        return produto;
    }
}