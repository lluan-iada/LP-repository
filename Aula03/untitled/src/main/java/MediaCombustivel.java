import java.util.Scanner;

public class MediaCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Informe a quantidade consumida em litros de combústivel");
        double litros = scanner.nextDouble();

        double mediaLitros = distancia / litros;

        System.out.println("Você consumiu em média: " + mediaLitros + " litros de combustivel");
    }
}
