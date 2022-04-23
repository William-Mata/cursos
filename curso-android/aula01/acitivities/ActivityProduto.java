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

public class ActivityProduto extends AppCompatActivity {

    private EditText editCodigoProduto;
    private EditText editNomeProduto;
    private EditText editQtdProduto;
    private EditText editPreco;

    private Button btnSalvarProduto;

    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        editCodigoProduto = (EditText) findViewById(R.id.editCodigoProduto);
        editNomeProduto = (EditText) findViewById(R.id.editNomeProduto);
        editQtdProduto = (EditText) findViewById(R.id.editQtdProduto);
        editPreco = (EditText) findViewById(R.id.editPreco);

        btnSalvarProduto = (Button) findViewById(R.id.btnSalvarProduto);

        this.clickNoBotaoSalvarListener();


    }

    private void clickNoBotaoSalvarListener(){
        this.btnSalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Produto produtoACadastrar = getDadosProdutoFormulario();

                if (produtoACadastrar != null){
                    ProdutoCtrl produtoCtrl = new ProdutoCtrl(ConexaoSQLite.getInstance(ActivityProduto.this));
                    long idProduto = produtoCtrl.salvarProdutoCrtl(produtoACadastrar);

                    if (idProduto > 0){
                        Toast.makeText(ActivityProduto.this,"Produto Cadastrado Com Sucesso!",
                                Toast.LENGTH_LONG ).show();
                    }
                    else
                    {
                        Toast.makeText(ActivityProduto.this, "Não foi possivel realizar o cadastro",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(ActivityProduto.this, "Todos os campos são Obrigatorios!",
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