package sptech.school;

public class Main {
    public static void main(String[] args) {
//        usarMetodo();
        ContaBancaria conta = new ContaBancaria();
        try{
           conta.sacar(25.00);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    public static void divisaoComErro(){
        int resultado = 10/0;
        System.out.println(resultado);
    }

//    public static void divisao(){
//        try {
//
//        } catch (){
//
//        }
//    }

    public static void divisaoErrada(){
        try {
            int result = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero. " + "\n" + e);
        } catch (RuntimeException e){
            System.out.println("");
        } catch (Exception e){
            System.out.println("Error??");
        }
    }

    // Exceção personalizada

    public static void metodo() throws Exception{
        throw new Exception("Error: método x errado");
    }

    public static void usarMetodo(){
        try {
            metodo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
