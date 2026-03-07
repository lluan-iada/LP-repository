package school.sptech;

public class Onibus {
    private Integer qtdPassageiros = 0;
    private Double valorPassagem = 5.0;

    public Onibus() {

    }

    public void cobrarPassagem(BilheteUnico bilhete){
        if (bilhete.getBloqueado()){
            System.out.println("Bilhete único bloqueado");
        } else {
            Double valorCobrado = this.valorPassagem;

            if (bilhete.getEstudante()){
                valorCobrado = this.valorPassagem / 2.0;
            }

            if (bilhete.getSaldo() < valorCobrado){
                System.out.println("Não há saldo suficiente para realizar a operação");
            } else {
                Double saldoAtual = bilhete.getSaldo();
                bilhete.setSaldo(saldoAtual - valorCobrado);

                this.qtdPassageiros++;
            }
        }
    }

    public void cobrarPassagem(Double dinheiro){
        if (dinheiro < valorPassagem){
            System.out.println("Dinheiro insuficiente para realizar operação");
        } else {
            this.qtdPassageiros++;
        }
    }

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public Double getValorPassagem() {
        return valorPassagem;
    }
}
