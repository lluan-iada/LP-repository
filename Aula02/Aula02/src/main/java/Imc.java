import java.util.Scanner;

public class Imc {
    public double imc(double altura, double peso){
        return peso/(Math.pow(altura,2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imc calc = new Imc();
        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double resultado = calc.imc(altura, peso);
        System.out.printf("Seu IMC é: %.2f", resultado);
    }
}
