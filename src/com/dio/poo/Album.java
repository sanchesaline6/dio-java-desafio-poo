package com.dio.poo;

import java.util.List;

public class Album {

    private List<Musica> musicas;
    private String cantor;
    private int anoLancamento;
    private int qtdFaixas;
    private String nomeAlbum;

    public Album() {
    }

    public Album(List<Musica> musicas, String cantor, int anoLancamento, int qtdFaixas, String nomeAlbum) {
        this.musicas = musicas;
        this.cantor = cantor;
        this.anoLancamento = anoLancamento;
        this.qtdFaixas = qtdFaixas;
        this.nomeAlbum = nomeAlbum;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQtdFaixas() {
        return qtdFaixas;
    }

    public void setQtdFaixas(int qtdFaixas) {
        this.qtdFaixas = qtdFaixas;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    @Override
    public String toString() {
        return "Album{" +
                "musicas=" + musicas +
                ", cantor='" + cantor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", qtdFaixas=" + qtdFaixas +
                ", nomeAlbum='" + nomeAlbum + '\'' +
                '}';
    }
}
