package ContaCorrente;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {
    private double saldo;
    private String titular;
    private int numeroConta;

    public ContaCorrente(String titular) {
        this.saldo = 0.0;
        this.titular = titular;
        this.numeroConta = ThreadLocalRandom.current().nextInt(100, 1000);
    }

    void depositar (double valor){
        if (valor <= 0.0){
            System.out.println("VALOR DO DEPÓSITO INVÁLIDO!");
            return;
        }
        saldo += valor;
    }

    void sacar (double valor){
        if (valor > saldo || valor <= 0.0){
            System.out.println("VALOR PARA SAQUE INVÁLIDO!");
            return;
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String novoNome) {
        if (novoNome == null){
            System.out.println("O nome não pode ser nulo");
        } else if (novoNome.length() < 2){
            System.out.println("O nome precisa ter no mínimo 2 letras");
        }
        this.titular = novoNome;
    }

    //    public int getNumeroConta() {
//        return numeroConta;
//    }

    String status (){
        return "Titular: " + this.titular + "\n"
                + "Número da conta: " + this.numeroConta + "\n"
                + "Saldo: " + this.saldo + "\n";
    }
}



