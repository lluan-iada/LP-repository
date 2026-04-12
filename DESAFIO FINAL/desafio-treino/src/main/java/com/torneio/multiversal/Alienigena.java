package com.torneio.multiversal;

public class Alienigena extends Lutador{
    private Double multiTransformacao;
    private Boolean sabeVoar;

    public Alienigena(String nome, Double energiaBase, Integer nivel,
                      Double multiTransformacao, Boolean sabeVoar) {
        super(nome, energiaBase, nivel);
        this.multiTransformacao = multiTransformacao;
        this.sabeVoar = sabeVoar;
    }

    public Alienigena() {
    }

    @Override
    public Double calcularPoderFinal() {
        return super.calcularPoderFinal() * this.getMultiTransformacao();
    }

    public Double getMultiTransformacao() {
        return multiTransformacao;
    }

    public void setMultiTransformacao(Double multiTransformacao) {
        this.multiTransformacao = multiTransformacao;
    }

    public Boolean getSabeVoar() {
        return sabeVoar;
    }

    public void setSabeVoar(Boolean sabeVoar) {
        this.sabeVoar = sabeVoar;
    }

    @Override
    public String toString() {
        return "Alienigena{" +
                "multiTransformacao=" + multiTransformacao +
                ", sabeVoar=" + sabeVoar +
                '}';
    }
}
