package school.sptech.pagamento;

public abstract class Pagamento {
    protected Double valor;

    public Pagamento() {
    }

    public Pagamento(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public abstract void realizarPagamento(Double valorPagamento);
}
