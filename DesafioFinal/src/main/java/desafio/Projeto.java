package desafio;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nomeProjeto;
    private Gerente lider;
    private List<Funcionario> equipe = new ArrayList<>();

    public Projeto(String nomeProjeto, Gerente lider) {
        this.nomeProjeto = nomeProjeto;
        this.lider = lider;
    }

    public void adicionarMembro(Funcionario f) {
        this.equipe.add(f);
    }

    public Double calcularCustoTotalProjeto(){
        Double totalCusto = 0.0;

        for (Funcionario funcionario : equipe) {
            totalCusto += funcionario.calcularSalario();
        }
        totalCusto +=this.lider.calcularSalario();
        return totalCusto;
    }

    public void exibirRelatorioProjeto(){
        this.lider.exibirResumo();
        for (Funcionario funcionario : equipe) {
            funcionario.exibirResumo();
        }
        System.out.println(this.calcularCustoTotalProjeto());
    }
}