package com.sptech.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[31m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso/(altura*altura);
        double imc2 = peso/(Math.pow(altura, 2));
        System.out.printf("Seu nome é: %s%s%s e seu IMC é: %.2f", ANSI_RESET, nome, ANSI_RESET, imc2);


       /*  System.out.println("INFORME SUA IDADE: ");
        // classe - atributo - metodo

        int idade = scanner.nextInt();
        if (idade <=17 || idade >=60){
            System.out.println("Você não é obrigado a votar");
        } else {
            System.out.println("Você é obrigado a votar... SE LASCOU!!!");
        }
    } */

    }
}
