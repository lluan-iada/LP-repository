package relacionamento1;

public class Musica {
    private String nome;
    private String album;
    private String autor;
    private Integer duracao;

    public Musica() {

    }

    public Musica(String nome, String album, String autor, Integer duracao) {
        this.nome = nome;
        this.album = album;
        this.autor = autor;
        this.duracao = duracao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

//    public String toString() {
//        String mensagem = "Nome Música: %s, Album: %s, Autor: %s, Duração: %d".formatted(nome, album, autor, duracao);
//        return mensagem;
//    }


    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", album='" + album + '\'' +
                ", autor='" + autor + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}

