import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        divisao();
    }
        public static void divisao() {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Informe o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.println("Informe o segundo número: ");
                int n2 = scanner.nextInt();
                int resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException e){
                System.out.println("Informe um valor válido");
            } catch (NumberFormatException e){
                System.out.println("Informe um valor válido!");
            }catch (ArithmeticException e) {
                System.out.println("Erro: Divisão por zero não permitida!");

        }

    }
}

