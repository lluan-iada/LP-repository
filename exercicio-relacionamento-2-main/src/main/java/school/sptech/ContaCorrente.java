package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private String agencia;
    private String numero;
    private List<Operacao> operacoes = new ArrayList<>();

    public ContaCorrente() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void adicionarOperacao(String categoria, String descricao, Double valor){
        if (categoria == null || categoria.isBlank()){
            return;
        }

        if (descricao == null || descricao.isBlank()){
            return;
        }

        if (valor == null || valor == 0.0){
            return;
        }

        Operacao novaOperacao = new Operacao(categoria, descricao, valor);
            this.operacoes.add(novaOperacao);
    }

    public List<Operacao> buscarOperacoesPorCategoria(String categoria){
        List<Operacao> encontradas = new ArrayList<>();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getCategoria() != null && operacaoDaVez.getCategoria().equalsIgnoreCase(categoria)) {
                encontradas.add(operacaoDaVez);
            }
        }
        return encontradas;
    }

    public List<Operacao> buscarOperacoesPorValor(Double valor){
        List<Operacao> encontradas = new ArrayList<>();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null && operacaoDaVez.getValor().equals(valor)) {
                encontradas.add(operacaoDaVez);
            }
        }
        return encontradas;
    }

    public List<Operacao> buscarOperacoesSaida(){
        List<Operacao> encontradas = new ArrayList<>();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null && operacaoDaVez.getValor() < 0.0) {
                encontradas.add(operacaoDaVez);
            }
        }
        return encontradas;
    }

    public List<Operacao> buscarOperacoesEntrada(){
        List<Operacao> encontradas = new ArrayList<>();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null && operacaoDaVez.getValor() > 0.0) {
                encontradas.add(operacaoDaVez);
            }
        }
        return encontradas;
    }

    public List<Operacao> buscarOperacoesPorDescricao(String descricao) {
        if (descricao == null) {
            return new ArrayList<>();
        }
        List<Operacao> encontradas = new ArrayList<>();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getDescricao() != null) {
                String descricaoNoBanco = operacaoDaVez.getDescricao().toLowerCase();
                String descricaoBuscada = descricao.toLowerCase();

                if (descricaoNoBanco.contains(descricaoBuscada)) {
                    encontradas.add(operacaoDaVez);
                }
            }
        }
        return encontradas;
    }

    public Double buscarMaiorValor(){
        if (this.operacoes == null) {
            return 0.0;
        }
        Double maior = this.operacoes.get(0).getValor();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null && operacaoDaVez.getValor() > maior) {
                maior = operacaoDaVez.getValor();
            }
        }
        return maior;
    }

    public Double buscarMenorValor(){
        if (this.operacoes == null) {
            return 0.0;
        }
        Double menor = this.operacoes.get(0).getValor();
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null && operacaoDaVez.getValor() < menor) {
                menor = operacaoDaVez.getValor();
            }
        }
        return menor;
    }

    public Double obterSaldo(){
        Double saldo = 0.0;
        for (Operacao operacaoDaVez : this.operacoes) {
            if (operacaoDaVez.getValor() != null) {
                saldo = saldo + operacaoDaVez.getValor();
            }
        }
        return saldo;
    }

}
