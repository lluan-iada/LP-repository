package desafio;

public abstract class Funcionario {
    protected String nome;
    protected Integer matricula;
    protected Double salarioBase;

    public Funcionario(String nome, Integer matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();

    public void exibirResumo(){
        System.out.println("Nome: " + this.nome +  "\n" + "Matricula: " + this.matricula);
    }
}
