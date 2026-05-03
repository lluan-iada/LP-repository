package desafio;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, Integer matricula, Double salarioBase, String linguagem) {
        super(nome, matricula, salarioBase);
        this.linguagem = linguagem;
    }

    @Override
    public Double calcularSalario() {
        if (linguagem.equalsIgnoreCase("Java")){
            return this.salarioBase * 1.15;
        }
        return this.salarioBase;
    }
}
