package school.sptech;

public class Main {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    Turista turista = new Turista();
    turista.setNome("João");
    turista.setDias(2);
    turista.setConsumo(100.0);
    turista.setGuiaTuristico(true);

    Executivo executivo = new Executivo();
    executivo.setNome("Maria");
    executivo.setDias(3);
    executivo.setConsumo(200.0);
    executivo.setVip(true);
    executivo.setInternet(false);

    System.out.println("Cadastrando....");
    hotel.checkIn(turista, 101);
    hotel.checkIn(executivo, 102);

    hotel.exibirHospedes();

    System.out.println("Total a pagar (João): R$ " + turista.calcularTotalEstadia());
    System.out.println("Total a pagar (Maria): R$ " + executivo.calcularTotalEstadia());

    System.out.println("\nVerficando Disponibilidade....");
    hotel.checkOut(turista);

    boolean disponivel = hotel.verificarDisponibilidadeDoQuarto(101);
    System.out.println("Quarto 101 está livre agora? " + disponivel);
  }
}