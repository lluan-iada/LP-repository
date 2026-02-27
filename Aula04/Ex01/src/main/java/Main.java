import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro c1 = new Carro();
        c1.marca = "Renault Kwid";
        c1.ano = 2017;
        c1.modelo = "Iconic";
        c1.status();
    }
}
