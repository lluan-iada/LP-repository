package school.sptech;

public class PontoDeRecarga {
    private Integer qtdConsultasRealizadas = 0;
    private Integer qtdRecargasRealizadas = 0;

    public PontoDeRecarga() {

    }

    public Double consultarSaldo (BilheteUnico bilhete) {
        if(bilhete.getBloqueado()){
            System.out.println("Bilhete único bloqueado");
            return 0.0;
        } else{
            qtdConsultasRealizadas++;
            return bilhete.getSaldo();
        }
    }

    public void recarregar(BilheteUnico bilhete, Double valor){
        if (bilhete.getBloqueado()){
            System.out.println("Bilhete único bloqueado");
        } else if (valor < 5.0){
            System.out.println("Valor minímo de recarga não atingido");
        }
        else {
            Double saldoAntigo = bilhete.getSaldo();
            bilhete.setSaldo(saldoAntigo + valor);

            this.qtdRecargasRealizadas++;
        }
    }

    public void bloquear (BilheteUnico bilhete){
        bilhete.setBloqueado(true);
    }

    public Integer getQtdConsultasRealizadas() {
        return qtdConsultasRealizadas;
    }

    public Integer getQtdRecargasRealizadas() {
        return qtdRecargasRealizadas;
    }
}
