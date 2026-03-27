package school.sptech.funcionario;

import java.util.List;

public class Desenvolvedor extends Funcionario {
    private List<String> Linguagens;
    private String especialidade;

    public Desenvolvedor(){

    }

    public Desenvolvedor(String cpf, String nome, Double salario, List<String> linguagens, String especialidade) {
        super(cpf, nome, salario);
        Linguagens = linguagens;
        this.especialidade = especialidade;
    }

    public List<String> getLinguagens() {
        return Linguagens;
    }

    public void setLinguagens(List<String> linguagens) {
        Linguagens = linguagens;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
