package com.torneio.multiversal;

import java.util.ArrayList;
import java.util.List;

public class Torneio {
    private String nome;
    private List<Lutador> lutadores = new ArrayList<>();

    public Torneio(String nome, List<Lutador> lutadores) {
        this.nome = nome;
        this.lutadores = lutadores;
    }

    public Torneio() {
    }

    public void adicionarLutador (Lutador lutador){
        if (lutador != null && lutador.getEnergiaBase() > 0){
            lutadores.add(lutador);
        }
    }

    public void removerLutador (String nome) {
        this.lutadores.removeIf(n -> n != null &&
                nome.equalsIgnoreCase(n.getNome()));
    }

    public Lutador buscarPorNome(String nome){
        if (nome == null || nome.isBlank()){
            return null;
        }
        for (Lutador nomeLutador : lutadores) {
            if (nomeLutador != null && nomeLutador.getNome().equalsIgnoreCase(nome)){
                return nomeLutador;
            }
        }
        return null;
    }

    public Double calcularPoderTotalDoTorneio() {
        double poderFinal = 0.0;

        for (Lutador lutadore : lutadores) {
            if (lutadore != null) {
                poderFinal += lutadore.calcularPoderFinal();
            }
        }
            return poderFinal;
    }

    public List<Feiticeiro> buscarFeiticeirosComDominio(){
        List<Feiticeiro> feiticeirosDominio = new ArrayList<>();
        for (Lutador lutadore : lutadores) {
            if (lutadore instanceof Feiticeiro feiticeiro){
                if (feiticeiro.getExpansaoDominio() != null && feiticeiro.getExpansaoDominio()){
                    feiticeirosDominio.add(feiticeiro);
                }
            }
        }
        return feiticeirosDominio;
    }

    public List<Alienigena> buscarAlienigenasQueVoam(Integer nivelMinimo){
        List<Alienigena> alienigenasVoadores = new ArrayList<>();
        for (Lutador lutadore : lutadores) {
            if (lutadore instanceof Alienigena aliens){
                if (aliens.getSabeVoar() != null && aliens.getSabeVoar() && aliens.getNivel() >= nivelMinimo){
                    alienigenasVoadores.add(aliens);
                }
            }
        }
        return alienigenasVoadores;
    }

    public Lutador buscarLutadorMaisForte(){
        Lutador maisForte = null;
        for (Lutador lutadore : lutadores) {
            if (lutadore != null){
                if (maisForte == null || lutadore.calcularPoderFinal() >
                        maisForte.calcularPoderFinal()){
                    maisForte = lutadore;
                }
            }
        }
        return maisForte;
    }

    public Lutador buscarLutadorMaisFraco(){
        Lutador maisFraco = null;

        for (Lutador lutadore : lutadores) {
            if (lutadore != null){
                if (maisFraco == null || lutadore.calcularPoderFinal() <
                maisFraco.calcularPoderFinal()){
                    maisFraco = lutadore;
                }
            }
        }
        return maisFraco;
    }

    public void removerLutadoresFracos(Double poderMinimo){
        if (poderMinimo == null){
            return;
        }
        this.lutadores.removeIf(l -> l != null &&
                l.calcularPoderFinal() < poderMinimo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Lutador> getLutadores() {
        return lutadores;
    }

    public void setLutadores(List<Lutador> lutadores) {
        this.lutadores = lutadores;
    }

}
