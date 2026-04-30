package relacionamento2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        String [] frutas = new String[5];
        frutas[0] = "Banana";
        frutas[1] = "Maçã";
        frutas[2] = "Melancia";
        frutas[3] = "Pera";
        frutas[4] = "Uva";

        System.out.println(Arrays.toString(frutas));

        // lista de nomes
        List <String> nomes = new ArrayList<>();
        nomes.add("Luis");
        nomes.add("Rian");
        nomes.add("Vinicius");
        nomes.add("José");
        nomes.add("Lydia");
        System.out.println(nomes);
        //Tamanho de elementos, não do vetor
        System.out.println("Tamanho da lista: " + nomes.size());

        //Pegar um elemento
        System.out.println("Primeiro elemento: " + nomes.get(0));

        //Ultimo elemento
        System.out.println("Último elemento: " + nomes.get(nomes.size() - 1));

        //Atualizar
        nomes.set(1, "Rian Oliveira");
        System.out.println(nomes);

        //Remover
        nomes.remove(1);
        System.out.println(nomes);

        String nomeParaRemover = "Vinicius";
        nomes.remove(nomeParaRemover);
        System.out.println(nomes);

        // Interar -> varrer a lista
        // nomes.fori
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //For voltando
        //nomes.forr
        for(int i = nomes.size() -1; i>0; i-- ){
            System.out.println(nomes.get(i));
        }

        // enheced for
        // usando o famoso for each
        // nomes.for
        for (String nomeAtual:nomes){
            System.out.println(nomeAtual);
        }

        // Remover da lista começando com "j"
        for (String nomeDaVez : nomes) {
            if (nomeDaVez.startsWith("J")){
                nomes.remove(nomeDaVez);
            }
        }
        System.out.println("Nome com J" + nomes);

        // Lista de numeros
        // int [] idades = new int[50]

        // dentro do <> só aceita classe
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros);

        Integer numeroParaRemover = 1;
        // A classe influencia
        numeros.remove(numeroParaRemover);
        System.out.println(numeros);
    }
}
