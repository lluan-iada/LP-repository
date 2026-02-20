import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        numeros();
    }

    public static void numeros() {
        int[] nums = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe um número: ");
            nums[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                soma += nums[i];
            }
        }
                System.out.println("A soma dos números ímpares do vetor é: " + soma);
    }
}
