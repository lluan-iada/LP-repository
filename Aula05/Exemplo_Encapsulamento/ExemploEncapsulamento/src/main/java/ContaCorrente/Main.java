package ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Luiz Felipe");
        System.out.println("Conta criada!");
//        System.out.println(conta.status());

//        conta.depositar(150.50);

        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Titular: " + conta.getTitular());

//        conta.sacar(50.00);
//        System.out.println(conta.status());
//
//        Scanner scanner = new Scanner(System.in);
    }
}
