package list.pesquisa.catalogodelivros;

public class Livro {
    private String titulo, autor;
    private int anoPubli;

    public Livro(String titulo, String autor, int anoPubli) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPubli=" + anoPubli +
                '}';
    }
}
