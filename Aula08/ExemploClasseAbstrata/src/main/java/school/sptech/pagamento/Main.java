package school.sptech.pagamento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCredito = new PagamentoCredito();
        Pagamento pagamentoPix = new PagamentoPix();
        List<Pagamento> pagamentos = List.of(pagamentoCredito, pagamentoPix);

        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento(100.00);

        }
    }


}
