public class Calculos {
    public int somar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int even(int a) {
        return a;
    }

    public boolean ehPar(int a) {
        return a % 2 == 0;
    }

//    public static void main (String [] args){
//        Soma sum  = new Soma();
//        int resultado = sum.somar(5,3);
//        System.out.println(resultado);
//    }

//    public static void main(String[] args) {
//        Calculos mult = new Calculos();
//
//
//        int resultador = mult.multiplicar(6, 4);
//        System.out.println(resultador);
//    }
//}


    // Método even //
//    public static void main(String[] args) {
//        Calculos par = new Calculos();
//        int num = par.even(2);
//        if (num % 2 == 0) {
//            System.out.println("PAR");
//        } else {
//            System.out.println("IMPAR");
//        }
//    }

    public static void main(String[] args) {
        Calculos par = new Calculos();
        boolean num = par.ehPar(4);
        System.out.println(num);
    }
}