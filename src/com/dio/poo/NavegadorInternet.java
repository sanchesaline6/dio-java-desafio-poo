package com.dio.poo;

import java.util.List;

public class NavegadorInternet implements Aplicativo{

    private List<String> resultadosBusca;
    private boolean paginaAtualizada = false;

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo: NavegadorInternet");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o aplicativo: NavegadorInternet");
    }

    public void exibirPagina(String pagina){
        if(carregarPagina(pagina) != null){
            System.out.println(pagina);
        }
        else {
            System.out.println("Página não encontrada!");
        }
    }

    public String carregarPagina(String resultado){
        for(String resultadoPagina : resultadosBusca){
            if(resultadoPagina.equals(resultado)){
                return resultado;
            }
        }

        return null;
    }

    public void atualizarPagina(){
        if(!paginaAtualizada){
            System.out.println("Atualizando página...");
        }
        else{
            System.out.println("Página já atualizada...");
        }
    }
}
