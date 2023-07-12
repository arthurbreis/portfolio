package entities;

public class Pessoas {
    private String genero;
    private double altura;

    public Pessoas(){

    }
    public Pessoas(String genero, double altura) {
        this.genero = genero;
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
