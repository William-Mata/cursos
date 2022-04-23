package com.example.aula01.model;

public class ItemDoCarrinho {

    private long id;
    private String nome;
    private int quantidadeSelecionada;
    private long idProduto;
    private double preco;
    private double valorTotal;

    @Override
    public String toString() {
        return "ItemDoCarrinho{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidadeSelecionada=" + quantidadeSelecionada +
                ", idProduto=" + idProduto +
                ", preco=" + preco +
                ", valorTotal=" + valorTotal +
                '}';
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeSelecionada() {
        return quantidadeSelecionada;
    }

    public void setQuantidadeSelecionada(int quantidadeSelecionada) {
        this.quantidadeSelecionada = quantidadeSelecionada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
