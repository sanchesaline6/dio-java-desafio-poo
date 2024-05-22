package com.dio.poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public void atualizarContato(Contato contato) {
        contatos.set(contatos.indexOf(contato), contato);
    }

    public Contato buscarContato(Contato contato){
       for(Contato contatoBuscado : contatos){
           if(contatoBuscado.getIdContato() == contato.getIdContato()){
               return contato;
           }
       }

       return null;
    }
}
