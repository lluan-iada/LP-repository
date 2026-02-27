import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Digitar números: ");
        System.out.println("2. Ver pares: ");
        System.out.println("3. Ver impares: ");
        System.out.println("4. Verificar soma de todos os números: ");
        System.out.println("5. Soma de todos os números pares: ");
        System.out.println("6. Sair");

//        int [] nums = new int[10];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < nums.length;i++) {
//            System.out.println("Informe um número: ");
//            nums[i] = scanner.nextInt();
//        }
    }

    public static int[] carregarVetor(){
        int[] vetor = new int [10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length;i++){
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextInt();

        }
    }

    public static void menu(){
        int[] num = carregarVetor();
        Scanner scanner = new Scanner(System.in);
    }

    public static void mostrarPares (int [] nums){
        for (int i = 0; i < nums.length; i++){
            if (nums[i]%2 == 0){
                System.out.println(nums[i] + " é um número par!");
            }
        return;
        }
    }

    public static void mostrarImpares(){

    }

    public static void somaPares(){

    }
}
