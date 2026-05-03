package desafio;

public class Gerente extends Funcionario implements Bonificavel{
    private Integer qtdEquipes;

    public Gerente(String nome, Integer matricula, Double salarioBase, Integer qtdEquipes) {
        super(nome, matricula, salarioBase);
        this.qtdEquipes = qtdEquipes;
    }

    @Override
    public Double calcularBonusAprovacao() {
        return this.qtdEquipes * 500.00;
    }

    @Override
    public Double calcularSalario() {
        return this.salarioBase + this.calcularBonusAprovacao();
    }

}
