package com.dio.poo;

public class AparelhoTelefonico implements Aplicativo{
    private Agenda agenda;
    private boolean estaEmLigacao;

    public void ligar(Contato contato){
       if( agenda.buscarContato(contato) != null){
           System.out.println("Ligando para " + contato.getNome());
           this.estaEmLigacao = true;
       }
       else{
           System.out.println("Contato não existe!");
       }

    }

    public void desligar(Contato contato){
        if(estaEmLigacao){
            this.estaEmLigacao = false;
            System.out.println("Chamada encerrada com " + contato.getNome());
        }
        else{
            System.out.println("Nenhuma chamada em andamento");
        }
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o aplicativo: Aparelho Telefônico");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o aplicativo: Aparelho Telefônico");
    }
}
