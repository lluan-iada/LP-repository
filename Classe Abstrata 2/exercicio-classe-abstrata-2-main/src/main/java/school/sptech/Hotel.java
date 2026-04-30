package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Hospede> hospedes = new ArrayList<>();

    public Hotel(String nome) {
        this.nome = nome;
        this.hospedes = new ArrayList<>();
    }

    public Hotel() {
    }

    public Boolean verificarDisponibilidadeDoQuarto(Integer quarto) {
        for (Hospede hospedeDaVez : hospedes) {
            if (hospedeDaVez.getQuarto() != null && hospedeDaVez.getQuarto().equals(quarto)) {
                return false;
            }
        }
        return true;
    }
    public Boolean checkIn(Hospede hospede, Integer quarto) {
        if (quarto != null && quarto > 0 && verificarDisponibilidadeDoQuarto(quarto)) {
            hospede.setQuarto(quarto);
            hospedes.add(hospede);
            return true;
        }
        return false;
    }

    public Boolean checkOut(Hospede hospede) {
        return hospedes.remove(hospede);
    }

    public void exibirHospedes() {
        if (hospedes.isEmpty()) {
            System.out.println("Não tem hóspedes no momento...");
        } else {
            for (Hospede hospede : hospedes) {
                System.out.println(hospede);
            }
        }
    }

    public List<Turista> getTuristas() {
        List<Turista> listaTuristas = new ArrayList<>();

        for (Hospede hospede : hospedes) {
            if (hospede instanceof Turista) {
                listaTuristas.add((Turista) hospede);
            }
        }
        return listaTuristas;
    }

    public List<Executivo> getClientesVip() {
        List<Executivo> listaVips = new ArrayList<>();

        for (Hospede hospede : hospedes) {
            if (hospede instanceof Executivo) {
                Executivo executivo = (Executivo) hospede;
                if (executivo.getVip() != null && executivo.getVip()) {
                    listaVips.add(executivo);
                }
            }
        }
        return listaVips;
    }

    public String getNome() {
        return nome;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }
}