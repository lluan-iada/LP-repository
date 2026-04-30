public class Carro {
    String marca;
    int ano;
    String modelo;


public Carro (){
   modelo = "sei lá";
}

    public void status (){
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Modelo: " + this.modelo);
    }
}
