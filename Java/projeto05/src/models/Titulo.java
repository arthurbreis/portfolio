package models;

public class Titulo {

    private String nome;
    private int anoLancamento, totalAvaliacoes, duracao;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public void fichaTecnica() {
        System.out.println(nome);
        System.out.println(anoLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

}
