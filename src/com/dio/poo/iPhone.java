package com.dio.poo;

import java.util.List;

public class iPhone {

    private List<Aplicativo> aplicativos;
    private Aplicativo aplicativoSelecionado;
    private boolean telaBloqueada;
    private boolean modoSilenciosoAtivo;
    private boolean ligado;

    public iPhone() {
    }

    public iPhone(List<Aplicativo> aplicativos, Aplicativo aplicativoSelecionado, boolean telaBloqueada, boolean modoSilenciosoAtivo, boolean ligado) {
        this.aplicativos = aplicativos;
        this.aplicativoSelecionado = aplicativoSelecionado;
        this.telaBloqueada = telaBloqueada;
        this.modoSilenciosoAtivo = modoSilenciosoAtivo;
        this.ligado = ligado;
    }

    public List<Aplicativo> getAplicativos() {
        return aplicativos;
    }

    public void setAplicativos(List<Aplicativo> aplicativos) {
        this.aplicativos = aplicativos;
    }

    public Aplicativo getAplicativoSelecionado() {
        return aplicativoSelecionado;
    }

    public void setAplicativoSelecionado(Aplicativo aplicativoSelecionado) {
        this.aplicativoSelecionado = aplicativoSelecionado;
    }

    public boolean isTelaBloqueada() {
        return telaBloqueada;
    }

    public void setTelaBloqueada(boolean telaBloqueada) {
        this.telaBloqueada = telaBloqueada;
    }

    public boolean isModoSilenciosoAtivo() {
        return modoSilenciosoAtivo;
    }

    public void setModoSilenciosoAtivo(boolean modoSilenciosoAtivo) {
        this.modoSilenciosoAtivo = modoSilenciosoAtivo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "aplicativos=" + aplicativos +
                ", aplicativoSelecionado=" + aplicativoSelecionado +
                ", telaBloqueada=" + telaBloqueada +
                ", modoSilenciosoAtivo=" + modoSilenciosoAtivo +
                ", ligado=" + ligado +
                '}';
    }

    public void desbloquearTela(){
        if(telaBloqueada){
            setTelaBloqueada(false);
            System.out.println("Bloqueando tela...");
        }
        else{
            System.out.println("Tela já bloqueada");
        }
    }

    public void silenciar(){
        if(modoSilenciosoAtivo){
            System.out.println("Aparelho já no modo silencioso");
        }
        else{
            setModoSilenciosoAtivo(false);
            System.out.println("Silenciando o aparelho...");
        }
    }

    public void selecionarAplicativo(Aplicativo aplicativo){
        for(Aplicativo aplicativoASelecionar: aplicativos){
            if (aplicativo.equals(aplicativoASelecionar)){
                aplicativoSelecionado = aplicativoASelecionar;
            }

        }

        System.out.println("Aplicativo não encontrado");
    }
}
