import models.*;

import java.util.ArrayList;

import calculos.*;

public class Main {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.setNome("Top gun");
        filme01.setAnoLancamento(2022);
        filme01.setDuracao(120);

        filme01.fichaTecnica();

        filme01.avalia(10);
        filme01.avalia(20);

        Filme filme02 = new Filme();
        filme02.setNome("The DaVinci Code");
        filme02.setAnoLancamento(2015);
        filme02.setDuracao(120);

        filme02.fichaTecnica();

        filme02.avalia(10);
        filme02.avalia(20);

        System.out.println(filme01.getTotalAvaliacoes());

        System.out.println(filme01.mediaAvaliacoes());

        Serie serie01 = new Serie();
        serie01.setNome("YOU");
        serie01.setAnoLancamento(2020);
        serie01.setEpPorTemporadas(5);
        serie01.setTemporadas(5);
        serie01.setMinPorEps(60);

        serie01.fichaTecnica();

        CalculadoraTempo calc = new CalculadoraTempo();
        calc.inclui(filme01);
        calc.inclui(serie01);
        System.out.println("Total de horas: " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme01);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme01);
        filmes.add(filme02);
        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primero da lista: " + filmes.get(0).getNome());



    }
}
