package com.torneio.multiversal;

public class Feiticeiro extends Lutador{
    private Double energiaAmaldicoada;
    private Boolean expansaoDominio;

    public Feiticeiro(String nome, Double energiaBase, Integer nivel, Double energiaAmaldicoada,
                      Boolean expansaoDominio) {
        super(nome, energiaBase, nivel);
        this.energiaAmaldicoada = energiaAmaldicoada;
        this.expansaoDominio = expansaoDominio;
    }

    public Feiticeiro() {
    }

    @Override
    public Double calcularPoderFinal() {
        if (this.getExpansaoDominio()){
            return super.calcularPoderFinal() + this.getEnergiaAmaldicoada() + 5000;
        } else {
            return super.calcularPoderFinal() + this.getEnergiaAmaldicoada();
        }
    }

    public Double getEnergiaAmaldicoada() {
        return energiaAmaldicoada;
    }

    public void setEnergiaAmaldicoada(Double energiaAmaldicoada) {
        this.energiaAmaldicoada = energiaAmaldicoada;
    }

    public Boolean getExpansaoDominio() {
        return expansaoDominio;
    }

    public void setExpansaoDominio(Boolean expansaoDominio) {
        this.expansaoDominio = expansaoDominio;
    }

    @Override
    public String toString() {
        return "Feiticeiro{" +
                "energiaAmaldicoada=" + energiaAmaldicoada +
                ", expansaoDominio=" + expansaoDominio +
                '}';
    }
}
