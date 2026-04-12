package com.torneio.multiversal;

public class Lutador {
    private String nome;
    private Double energiaBase;
    private Integer nivel;

    public Lutador(String nome, Double energiaBase, Integer nivel) {
        this.nome = nome;
        this.energiaBase = energiaBase;
        this.nivel = nivel;
    }

    public Lutador() {
    }

    public Double calcularPoderFinal(){
        return this.energiaBase * this.nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getEnergiaBase() {
        return energiaBase;
    }

    public void setEnergiaBase(Double energiaBase) {
        this.energiaBase = energiaBase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "nome='" + nome + '\'' +
                ", energiaBase=" + energiaBase +
                ", nivel=" + nivel +
                '}';
    }
}
