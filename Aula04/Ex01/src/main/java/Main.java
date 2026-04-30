import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Carro c1 = new Carro();
//        c1.marca = "Renault Kwid";
//        c1.ano = 2017;
//        c1.status();
//
//        System.out.println("Gatos abaixo: ");
//        System.out.println("-----------------");
//        Gatos felino = new Gatos();
//        felino.nome = "Tom";
//        felino.raca = "Frajola";
//        felino.estado = "Irritado";
//
//        felino.status();

        Triangulo modelo1 =  new Triangulo();
        System.out.println("Informe a altura do triângulo: ");
        modelo1.altura = (float) scanner.nextDouble();
        System.out.println("Informe a base do triângulo: ");
        modelo1.base = (float) scanner.nextDouble();
        modelo1.ImprimeDados();
        modelo1.Area();
    }
}
