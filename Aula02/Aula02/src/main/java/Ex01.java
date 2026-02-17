public class Ex01 {
    public static void main(String[] args) {
        int i = 1000;

        for(;i<=2000; i++){
            if (i%11 == 5) {
                System.out.println(i + " com resto 5");
            } else{
                System.out.println(i);
            }
        }
    }
}

