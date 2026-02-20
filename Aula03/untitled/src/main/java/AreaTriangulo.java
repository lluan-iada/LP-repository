import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do triangulo: ");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura do tringulo: ");
        double altura = scanner.nextDouble();

        double media = (base * altura) / 2;

        System.out.println("A área do trinagulo é de: " + media);
    }
}
