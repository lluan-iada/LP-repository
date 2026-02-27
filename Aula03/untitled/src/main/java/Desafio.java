import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        boolean numerosDigitados = false;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                numeros = digitarNumeros();
                numerosDigitados = true;
            } else if( opcao >=2 && opcao <=5){
                if (!numerosDigitados){
                    System.out.println("Você precisa preencher os números (Opção 1) primeiro!");
                } else {
                    if (opcao == 2) {
                        mostrarPares(numeros);
                    }
                    else if(opcao == 3){
                        mostrarImpares(numeros);
                    }
                    else if (opcao == 4){
                        somaNumeros(numeros);
                    }
                    else {
                        somaPares(numeros);
                    }
                }
            }
        } while (opcao != 6);
    }

    public static void exibirMenu(){
        System.out.println("\n--- MENU ---");
        System.out.println("1. Digitar números");
        System.out.println("2. Ver pares");
        System.out.println("3. Ver impares");
        System.out.println("4. Verificar soma de todos os números");
        System.out.println("5. Soma de todos os números pares");
        System.out.println("6. Sair");
    }

    public static int[] digitarNumeros(){
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    public static void mostrarPares(int[] vetor){
        System.out.println("\nNúmeros pares encontrados:");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }
    }

    public static void mostrarImpares(int [] vetor){
        System.out.println("\nNúmeros impares encontrados:");
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 !=0){
                System.out.println(vetor[i]);
            }
        }
    }

    public static void somaNumeros (int[] vetor){
        int soma = 0;
        for (int i = 0; i< vetor.length;i++){
            soma += vetor[i];
        }
        System.out.println("A soma de todos os números do vetor é: " + soma);
    }

    public static void somaPares(int [] vetor){
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 ==0){
                soma += vetor[i];
            }
        }
        System.out.println("A soma de todos os números pares é: " + soma);
    }
}