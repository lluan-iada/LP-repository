import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o valor da sua compra: ");
        double valorCompra = scanner.nextDouble();

        double aux = 0;

        if (valorCompra < 1000) {
            aux = valorCompra - ((valorCompra * 10) / 100);
        }
            System.out.printf("Parabéns %s, você recebeu um desconto de %f reais", nome, aux);
    }
}


