public class Ex02 {
    public static void main(String[] args) {
        BilheteUnico bilhete = new BilheteUnico();
        bilhete.titular = "Luan";
        bilhete.cpf = "45869842274";

        bilhete.recarregar(50.0);
//        bilhete.recarregar(210.0);

//        bilhete.perdeuBilhete();
        // Metodo desafio

        bilhete.passagemComumOnibus();
//        bilhete.passagemComumMetroTrem();

        bilhete.passagemIntegracao();

    }
}
