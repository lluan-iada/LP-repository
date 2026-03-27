package school.sptech.pagamento;

public class PagamentoPix extends Pagamento{
    private Double taxa;

    public PagamentoPix() {
    }

    public PagamentoPix(Double valor, Double taxa) {
        super(valor);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void realizarPagamento(Double valorPagamento) {
        System.out.println("Valor pago com pix");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
