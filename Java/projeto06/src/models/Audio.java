package models;

public class Audio {
    private String titulo;
    private int totalReproducoes, totalCurtidas, classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
    
}

