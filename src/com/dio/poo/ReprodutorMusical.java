package com.dio.poo;

import java.util.List;

public class ReprodutorMusical implements Aplicativo{

    private boolean estaTocando;
    private List<Album> albuns;
    private Musica musicaAtual;
    private Album albumAtual;

    public ReprodutorMusical() {
    }

    public boolean isEstaTocando() {
        return estaTocando;
    }

    public void setEstaTocando(boolean estaTocando) {
        this.estaTocando = estaTocando;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }

    public Musica getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(Musica musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public Album getAlbumAtual() {
        return albumAtual;
    }

    public void setAlbumAtual(Album albumAtual) {
        this.albumAtual = albumAtual;
    }

    @Override
    public String toString() {
        return "ReprodutorMusical{" +
                "estaTocando=" + estaTocando +
                ", albuns=" + albuns +
                ", musicaAtual=" + musicaAtual +
                ", albumAtual=" + albumAtual +
                '}';
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo: Reprodutor Musical");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o aplicativo: Reprodutor Musical");
    }

    public void tocar(String nome){
        if(!nome.isEmpty()){
            for(Album album: albuns){
                List<Musica> listaMusicas = album.getMusicas();
                for(Musica musica: listaMusicas){
                    if (musica.getNome().equals(nome)){
                        albumAtual.setNomeAlbum(album.getNomeAlbum());
                        musicaAtual = musica;
                        System.out.println("Tocando a música: " + nome);
                        System.out.println("Do álbum: " + album.getNomeAlbum());
                    }
                    else{
                        System.out.println("Música não encontrada");
                    }
                }
            }
        }
    }

    public void pausar(){
        if(estaTocando){
            estaTocando = false;
            System.out.println("Pausando a música!!");
        }
        else{
            System.out.println("Música já pausda");
        }

    }

    public void proximaMusica(){
        List<Musica> selecaoMusicas = albumAtual.getMusicas();
        for(Musica musica : selecaoMusicas){
            if(musica.equals(musicaAtual)){
                int faixaAtual = musicaAtual.getNumFaixa();
                if(albumAtual.getQtdFaixas() < faixaAtual + 1){
                    musicaAtual.setNumFaixa(faixaAtual + 1);
                }
                else {
                    System.out.println("Não tem próxima música");
                }

            }
        }
    }
    public void anteriorMusica(){
        List<Musica> selecaoMusicas = albumAtual.getMusicas();
        for(Musica musica : selecaoMusicas){
            if(musica.equals(musicaAtual)){
                int faixaAtual = musica.getNumFaixa();
                if(albumAtual.getQtdFaixas() > faixaAtual - 1){
                    musicaAtual.setNumFaixa(faixaAtual - 1);
                }
                else{
                    System.out.println("Não tem música anterior");
                }

            }
        }
    }

    public void selecionarMusica (Musica musica){
        musicaAtual = albumAtual.getMusicas().get(musica.getNumFaixa());
    }

    public void selecionarAlgum (Album album){
        for (Album album1 : albuns){
            if(album1.equals(album)){
                albumAtual = album;
            }
        }
    }


}
