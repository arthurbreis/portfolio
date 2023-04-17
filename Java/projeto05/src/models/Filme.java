package models;

import calculos.*;

public class Filme extends Titulo implements Classificar {
    private String diretor;

    public Filme(String nome, int AnoLancamento) {
        super(nome, AnoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2;
    }

}
