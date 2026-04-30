package school.sptech;

public class Turista extends Hospede {

    private Boolean guiaTuristico;
    public Turista() {
    }

    public Turista(String nome, String documento, Integer quarto, Integer dias, Double consumo, Boolean guiaTuristico) {
        super(nome, documento, quarto, dias, consumo);
        this.guiaTuristico = guiaTuristico;
    }

    @Override
    public Double calcularDiaria() {
        Double valorBase = 1500.0;
        if (this.guiaTuristico != null && this.guiaTuristico) {
            valorBase += 500.0;
        }
        return valorBase;
    }

    public Boolean getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(Boolean guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    @Override
    public String toString() {
        return "Turista{" +
                "guiaTuristico=" + guiaTuristico +
                "} " + super.toString();
    }
}