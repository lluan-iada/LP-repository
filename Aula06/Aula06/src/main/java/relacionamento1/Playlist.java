package relacionamento1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();
    private Usuario usuario;

    public Playlist(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }

    public void adicionarMusica(Musica novaMusica){
        musicas.add(novaMusica);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public int tempoSegundos(){
        int tempoTotal= 0;
        for (int i = 0; i < musicas.size(); i++) {
            tempoTotal += musicas.get(i).getDuracao();
        }
        return tempoTotal;
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", musicas=" + musicas +
                ", usuario=" + usuario +
                '}';
    }
}

