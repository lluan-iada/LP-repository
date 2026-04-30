package relacionamento2;

public class Main {
    public static void main(String[] args) {
        Produto p01 = new Produto("Bala", 0.1);
        Produto p02 = new Produto("Tv", 2.540);

        Pedido pedido01 = new Pedido("0001");
        ItemPedido item01 = new ItemPedido(p01, 2);

        pedido01.adicionarItem(p01, 10);
        System.out.println(pedido01);

        // segundo pedido
        Pedido pedido02 = new Pedido("0002");
        ItemPedido item02 = new ItemPedido(p02, 4);

        System.out.println(pedido02);

//        pedido01.precoTotal();
//        System.out.println("Total pedido: " + pedido01.precoTotal());
//
//

    }
}
