package com.example.aula01.controller;

import com.example.aula01.DAO.VendaDAO;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Venda;

import java.util.List;

public class VendaCtrl {

    private final VendaDAO vendaDAO;

    public VendaCtrl(ConexaoSQLite conexaoSQLite){
        vendaDAO = new VendaDAO(conexaoSQLite);
    }

    public long salvarVendaCtrl(Venda venda){
        return vendaDAO.salvarVendaDao(venda);
    }

    public boolean salvarItensDaVendaCtrl(Venda venda){

        return vendaDAO.salvarItensDaVendaDAO(venda);
    }

    public List<Venda> listarVendasCtrl(){
        return vendaDAO.listarVendasDAO();
    }
}
