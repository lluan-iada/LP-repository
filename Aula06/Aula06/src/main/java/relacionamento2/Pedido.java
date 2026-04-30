package relacionamento2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String codigo;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(String codigo){
        this.codigo = codigo;
    }

    public void adicionarItem(Produto produto, Integer quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

//    public Double totalPedido (){
//        double total = 0;
//        for (int i = 0; i < itens.size(); i++) {
//            total += itens.get(i).getProduto();
//        }
//        return totalPedido;
//    }

//    public Double totalPeidido(){
//        Double total = 0.0;
//        for (int i = 0; i < itens.size(); i++) {
//            ItemPedido itemPedido = itens.get(i);
//            Produto
//        }
//    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", itens=" + itens +
                '}';
    }
}
