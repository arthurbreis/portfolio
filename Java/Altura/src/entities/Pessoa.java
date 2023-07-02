package entities;

public class Pessoa {
    private String Nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        Nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return idade;
    }

}
