package com.dio.poo;

import java.util.List;

public class ReprodutorMusical implements Aplicativo{

    private boolean estaTocando;
    private List<Album> albuns;

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo: Reprodutor Musical");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o aplicativo: Reprodutor Musical");
    }
    public void tocar(String nome){
        if(nome != ""){
            for(Album album: albuns){
                List<Musica> listaMusicas = album.getMusicas();
                for(Musica musica: listaMusicas){
                    if (musica.getNome().equals(nome)){
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
        System.out.println("Pausando a música!!");
    }
}
