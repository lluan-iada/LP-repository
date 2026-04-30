package sptech.school;

public class ContaBancaria {
    private Double saldo = 100.00;


    public void sacar (double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
        System.out.println("Saque realizado. Valor restante: " + "\n" + "R$ " + saldo);

    }



}
