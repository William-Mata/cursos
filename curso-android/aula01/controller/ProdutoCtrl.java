package com.example.aula01.controller;

import com.example.aula01.DAO.ProdutoDAO;
import com.example.aula01.adapters.AdapterListaProdutos;
import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

import java.util.List;

public class ProdutoCtrl {

    private final ProdutoDAO produtoDAO;

    public ProdutoCtrl(ConexaoSQLite conexaoSQLite){
        produtoDAO = new ProdutoDAO(conexaoSQLite);
    }

    public long salvarProdutoCrtl(Produto produto){
        return  this.produtoDAO.salvarProdutoDao(produto);
    }

    public List<Produto> getListaProdutosCtrl(){
        return this.produtoDAO.getListaProdutosDAO();
    }

    public boolean excluirProdutoCtrl(long idProduto){
        return this.produtoDAO.excluirProdutoDAO(idProduto);
    }

    public boolean alterarProdutoCtrl(Produto produto){
        return this.produtoDAO.alterarProdutoDAO(produto);
    }

}
