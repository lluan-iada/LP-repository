package relacionamento2;

public class Produto {
    private String nome;
    private Double precoBase;

    public Produto(String nome, Double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoBase=" + precoBase +
                '}';
    }
}
