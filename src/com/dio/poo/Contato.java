package com.dio.poo;

public class Contato {
    private int idContato;
    private String nome;
    private String numeroCelular;
    private String numeroFixo;
    private String email;

    public Contato() {
    }

    public Contato(int idContato, String nome, String numeroCelular, String numeroFixo, String email) {
        this.idContato = idContato;
        this.nome = nome;
        this.numeroCelular = numeroCelular;
        this.numeroFixo = numeroFixo;
        this.email = email;
    }

    public int getIdContato() {
        return idContato;
    }

    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroFixo() {
        return numeroFixo;
    }

    public void setNumeroFixo(String numeroFixo) {
        this.numeroFixo = numeroFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "idContato=" + idContato +
                ", nome='" + nome + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", numeroFixo='" + numeroFixo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
