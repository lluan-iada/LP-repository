public class Main {
    public static void main(String[] args) {

        Cofrinho meuCofre = new Cofrinho();
        meuCofre.setDono("Luan");

        Cofrinho cofreDoJoao = new Cofrinho();
        cofreDoJoao.setDono("Concorrente");

        meuCofre.depositar(37.10);
        cofreDoJoao.depositar(20.0);

        Boolean ganhando = meuCofre.isMaiorQue(cofreDoJoao);
        System.out.println("Sou mais rico que o João?? " + ganhando);

        Double dinheiro = meuCofre.sacudir();
        System.out.println("Caiu do cofre: R$ " + dinheiro);
        System.out.println("Saldo restante: R$ " + meuCofre.getSaldo());

        meuCofre.quebrar();

        meuCofre.depositar(50.0);
    }
}