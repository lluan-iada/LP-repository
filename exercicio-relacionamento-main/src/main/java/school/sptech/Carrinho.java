package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Carrinho() {

    }

    public Integer getQuantidade(){
        return this.produtos.size();
    }

    public void adicionar(Produto produto){
        this.produtos.add(produto);
    }

    public Boolean existsPorNome(String nome){
        for (Produto produtoDaVez : this.produtos) {
            if (produtoDaVez.getNome() != null && produtoDaVez.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome){
        Integer contador = 0;
        for (Produto produtoDaVez : this.produtos) {
            if (produtoDaVez.getCategoria() != null && produtoDaVez.getCategoria().equalsIgnoreCase(nome)) {
                contador++;
            }
        }
        return contador;
    }

    public void limpar(){
        this.produtos = new ArrayList<>();
    }

    public void removerPorNome(String nome){
        Produto produtoEncontrado = getPorNome(nome);
            if (produtoEncontrado != null) {
                this.produtos.remove(produtoEncontrado);
        }
    }

    public Produto getPorNome(String nome){
        for (Produto produtoDaVez : this.produtos) {
            if (produtoDaVez.getNome() != null && produtoDaVez.getNome().equalsIgnoreCase(nome)) {
                return produtoDaVez;
            }
        }
        return null;
    }

    public Double getValorTotal(){
        Double total = 0.0;
        for (Produto produtoDaVez : this.produtos) {
            if (produtoDaVez.getPreco() != null) {
                total = total + produtoDaVez.getPreco();
            }
        }
        return total;
    }
}
