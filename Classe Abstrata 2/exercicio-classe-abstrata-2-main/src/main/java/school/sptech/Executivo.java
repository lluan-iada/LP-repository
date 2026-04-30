package school.sptech;

public class Executivo extends Hospede {

    private Boolean vip;
    private Boolean internet;
    public Executivo() {
    }

    public Executivo(String nome, String documento, Integer quarto, Integer dias, Double consumo, Boolean vip, Boolean internet) {
        super(nome, documento, quarto, dias, consumo);
        this.vip = vip;
        this.internet = internet;
    }

    @Override
    public Double calcularDiaria() {
        Double valorBase = 2000.0;
        if (this.vip != null && this.vip) {
            valorBase += 1000.0;
        }
        if (this.internet != null && this.internet) {
            valorBase += 500.0;
        }
        return valorBase;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "Executivo{" +
                "vip=" + vip +
                ", internet=" + internet +
                "} " + super.toString();
    }
}