public class BilheteUnico {
    String cpf;
    double saldo;
    String titular;
    Integer ultimoUso;
    boolean ativo; // Para o desafio

    public BilheteUnico() {
        this.saldo = 0.0;
        this.ultimoUso = 0;
        this.ativo = true;
    }

    public void recarregar(Double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor da recarga precisa ser positivo!");
        } else if (this.saldo + valor > 250.0) {
            System.out.println("Erro: O limite do bilhete é R$ 250,00. Operação cancelada");
        } else {
            this.saldo += valor;
            System.out.println("Recarga de R$ " + valor + " realizada! Novo saldo: R$ " + this.saldo);
        }
    }

    public void passagemComumOnibus() {
        if (this.ativo == false){
            System.out.println("CHAMA A POLICIA! Este bilhete foi reportado como perdido!");
        }
        else if (this.saldo >= 5.0) {
            this.saldo -= 5.0;
            this.ultimoUso = 1;

            System.out.println("Passou! Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("BLOQUEADO: Saldo insuficiente para o Ônibus");
        }
    }

    public void passagemComumMetroTrem() {
        if (this.ativo == false){
            System.out.println("CHAMA A POLICIA! Este bilhete foi reportado como perdido!");
        }
        else if (this.saldo >= 5.20) {
            this.saldo -= 5.20;
            this.ultimoUso = 2;

            System.out.println("liberado! Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("BLOQUEADO: Saldo insuficiente para o Metrô/Trem");
        }
    }

    public void passagemIntegracao() {
        if (this.ativo == false){
            System.out.println("CHAMA A POLICIA! Este bilhete foi reportado como perdido!");
        }
        else if (this.ultimoUso == 1) {
            this.saldo = this.saldo - 3.90;
            System.out.println("Tome a integração! Cobrado: R$ 3,90. Saldo atual: R$ " + this.saldo);
        }
        else if (this.ultimoUso == 2) {
            this.saldo = this.saldo - 3.70;
            System.out.println("Tome a integração! Cobrado: R$ 3,70. Saldo atual: R$ " + this.saldo);
        }
        else {
            System.out.println("Nenhuma viagem anterior registrada. Use a passagem comum primeiro");
        }
    }

    public void perdeuBilhete() {
        this.ativo = false;
        System.out.println("BANIDO! Bilhete bloqueado ou roubado!!");
        System.out.println("Seu saldo de R$ " + this.saldo + " foi bloqueado!");
    }
}
