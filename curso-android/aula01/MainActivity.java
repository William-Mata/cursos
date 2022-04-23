package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aula01.acitivities.ActivityProduto;
import com.example.aula01.acitivities.ActivityVenda;
import com.example.aula01.acitivities.ListarProdutosActivity;
import com.example.aula01.acitivities.VendasConsolidadasActivity;
import com.example.aula01.controller.ProdutoCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastroProdutos;

    private Button btnListarProdutos;

    private Button btnVenda;

    private Button btnRelatorioVendas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexaoSQLite conexaoSQLite =  ConexaoSQLite.getInstance(this);

        this.btnListarProdutos = (Button) findViewById(R.id.btnListarProdutos);

        this.btnListarProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actListaProdutos = new Intent(MainActivity.this, ListarProdutosActivity.class);
                startActivity(actListaProdutos);
            }
        });

        this.btnCadastroProdutos = (Button) findViewById(R.id.btnCadastroProdutos);

        this.btnCadastroProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent actCadastroProdutos = new Intent(MainActivity.this, ActivityProduto.class );
                 startActivity(actCadastroProdutos);
            }
        });

        this.btnVenda = (Button)findViewById(R.id.btnVenda);

        this.btnVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actVenda = new Intent(MainActivity.this, ActivityVenda.class);
                startActivity(actVenda);
            }
        });

        this.btnRelatorioVendas = (Button) findViewById(R.id.btnRelatorioVendas);

        this.btnRelatorioVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actRelatorioVendas = new Intent(MainActivity.this, VendasConsolidadasActivity.class);
                startActivity(actRelatorioVendas);
            }
        });
    }
}