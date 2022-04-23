package com.example.aula01.acitivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.aula01.R;
import com.example.aula01.adapters.AdapterListaVendas;
import com.example.aula01.controller.VendaCtrl;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Venda;

import java.util.List;

public class VendasConsolidadasActivity extends AppCompatActivity {

    private ListView lsvRelatorioProdutos;
    private List<Venda> vendaList;
    private AdapterListaVendas adapterListaVendas;
    private VendaCtrl vendaCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendas_consolidadas);

        this.vendaCtrl = new VendaCtrl(ConexaoSQLite.getInstance(VendasConsolidadasActivity.this));

        vendaList = this.vendaCtrl.listarVendasCtrl();

        this.lsvRelatorioProdutos = (ListView)findViewById(R.id.lsvRelatorioProdutos);

        this.adapterListaVendas = new AdapterListaVendas(VendasConsolidadasActivity.this, this.vendaList);

        this.lsvRelatorioProdutos.setAdapter(this.adapterListaVendas);

    }
}