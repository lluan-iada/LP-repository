package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public Imagem() {
    }

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar (Figura figura){
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        double total = 0.0;

        for(Figura figura: figuras){
            total += figura.calcularArea();
        }
        return total;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> buscarFigurasMaiorQue20 = new ArrayList<>();

        for (Figura figura: figuras){
            if(figura.calcularArea() > 20){
                buscarFigurasMaiorQue20.add(figura);
            }
        }
        return buscarFigurasMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> buscarFigurasQuadradas = new ArrayList<>();

        for(Figura figura: figuras){
            if(figura instanceof Quadrado){
                buscarFigurasQuadradas.add(figura);
            }
        }
        return buscarFigurasQuadradas;
    }
}
