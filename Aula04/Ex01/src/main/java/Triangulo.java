public class Triangulo {
    float base;
    float altura;

    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public void Area (){
        float area = (this.base * this.altura) / 2;
        System.out.println("A area do triangulo é de: " + area);

    }
    public void ImprimeDados (){
        System.out.println("A base do triangulo é: " + this.base);
        System.out.println("A altura do triangulo é: " + this.altura);
    }
}
