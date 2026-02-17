import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i<=10;i++){
            int resultado = num * i;
            System.out.printf("%d x %d = %d %n", i, num, resultado);
        }
    }
}
