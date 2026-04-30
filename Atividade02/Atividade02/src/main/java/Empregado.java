public class Empregado {
    String nome;
    String cargo;
    double salario;

    public Empregado(){
        this.nome = "João";
        this.cargo = "Analista de Sistemas";
        this.salario= 5400;
    }

    public void ReajustarIlario(){
        double reajuste = this.salario*15/100;
        double NovoSalario = this.salario + reajuste;
        System.out.println("Seu novo salário é: " + NovoSalario);
    }

    public void TesteEmpregado(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: R$ " + this.salario);
    }

}
