package desafio;

public class Main {
    public static void main(String[] args) {
        Gerente chefe = new Gerente("Mestre Guanabara", 1, 5000.0, 2);
        Desenvolvedor dev1 = new Desenvolvedor("Luana", 2, 3000.0, "Java");
        Desenvolvedor dev2 = new Desenvolvedor("Zezinho", 3, 3000.0, "Python");

        Projeto sistema = new Projeto("TechColina ERP", chefe);

        sistema.adicionarMembro(dev1);
        sistema.adicionarMembro(dev2);

        sistema.exibirRelatorioProjeto();
    }
}
