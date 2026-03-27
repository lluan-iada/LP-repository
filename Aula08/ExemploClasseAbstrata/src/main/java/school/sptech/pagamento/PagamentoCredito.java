package school.sptech.pagamento;

public class PagamentoCredito extends Pagamento{
    private Integer qtdParcelas;

    public PagamentoCredito() {
    }

    public PagamentoCredito(Double valor, Integer qtdParcelas) {
        super(valor);
        this.qtdParcelas = qtdParcelas;
    }

    public Integer getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(Integer qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public void realizarPagamento(Double valorPagamento) {
        System.out.println("Relizar pagamento no crédito");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
