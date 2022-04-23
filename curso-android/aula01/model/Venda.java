package com.example.aula01.model;

import java.util.Date;
import java.util.List;

public class Venda {

    private long id;
    private Produto produtoVendido;
    private Date dataDaVenda;
    private String nomeDoCliente;
    private List<ItemDoCarrinho> listItemDoCarrinho;
    private double totalVenda;
    private int qtdItens;


    public Venda() {
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {

        this.qtdItens = qtdItens;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {

        this.totalVenda = totalVenda;
    }

    public List<ItemDoCarrinho> getListItemDoCarrinho() {
        return listItemDoCarrinho;
    }

    public void setListItemDoCarrinho(List<ItemDoCarrinho> listItemDoCarrinho) {
        this.listItemDoCarrinho = listItemDoCarrinho;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", produtoVendido=" + produtoVendido +
                ", dataDaVenda=" + dataDaVenda +
                ", nomeDoCliente='" + nomeDoCliente + '\'' +
                ", listItemDoCarrinho=" + listItemDoCarrinho +
                ", totalVenda=" + totalVenda +
                '}';
    }
}
