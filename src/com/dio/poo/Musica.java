package com.dio.poo;

public class Musica {
    private String nome;
    private int duracao;
    private int numFaixa;

    public Musica() {
    }

    public Musica(int numFaixa, int duracao, String nome) {
        this.numFaixa = numFaixa;
        this.duracao = duracao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getNumFaixa() {
        return numFaixa;
    }

    public void setNumFaixa(int numFaixa) {
        this.numFaixa = numFaixa;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", numFaixa=" + numFaixa +
                '}';
    }
}
