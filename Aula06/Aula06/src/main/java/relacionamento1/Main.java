package relacionamento1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario01 = new Usuario("Bob", "bob@email.com", "1140028922");

        Musica m01 = new Musica("505", "My Favorite Worst Nightmare", "Macacos Articos", 250);
        Musica m02 = new Musica("We never Dated", "I Barely Know Her", "Sombr", 340);

        Playlist playlist01 = new Playlist("Happiness dissipating", usuario01);

        playlist01.adicionarMusica(m02);

        System.out.println(usuario01);

        System.out.println(m01);
        System.out.println(m02);

        System.out.println(playlist01);

        Playlist playlist02 =  new Playlist("Felicidade, me visite", usuario01);

        playlist02.adicionarMusica(m01);
        System.out.println(playlist02);

        // retorne a quantidade total de segundos em uma playslit
        System.out.println("Tempo total: " + playlist01.tempoSegundos());



    }
}
