package com.example.calculadoradenotas.model;

public class Disciplinas {

    private long id;
    private String nomeDisciplina, situacao;
    private int simulado1, simulado2;
    private double prova, exame,  ntFinal;


    @Override
    public String toString() {
        return "Disciplinas{" +
                "id=" + id +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", situacao='" + situacao + '\'' +
                ", simulado1=" + simulado1 +
                ", simulado2=" + simulado2 +
                ", prova=" + prova +
                ", exame=" + exame +
                ", ntFinal=" + ntFinal +
                '}';
    }

    public double getExame() {
        return exame;
    }

    public void setExame(double exame) {
        this.exame = exame;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getSimulado1() {
        return simulado1;
    }

    public void setSimulado1(int simulado1) {
        this.simulado1 = simulado1;
    }

    public int getSimulado2() {
        return simulado2;
    }

    public void setSimulado2(int simulado2) {
        this.simulado2 = simulado2;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }

    public double getNtFinal() {
        return ntFinal;
    }

    public void setNtFinal(double ntFinal) {
        this.ntFinal = ntFinal;
    }
}
