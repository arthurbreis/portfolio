import models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import calculos.*;

public class Main {
    public static void main(String[] args) {
        Filme filme01 = new Filme("Top gun", 2022);
        filme01.setDuracao(120);

        filme01.fichaTecnica();

        filme01.avalia(10);
        filme01.avalia(20);

        Filme filme02 = new Filme("The DaVinci Code", 2015);
        filme02.setDuracao(120);

        filme02.fichaTecnica();

        filme02.avalia(10);
        filme02.avalia(20);

        System.out.println(filme01.getTotalAvaliacoes());

        System.out.println(filme01.mediaAvaliacoes());

        Serie serie01 = new Serie("YOU", 2020);
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

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme01);
        lista.add(filme02);
        lista.add(serie01);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primero da lista: " + lista.get(0).getNome());

        for (Titulo item : lista) {
            System.out.println(item);
        }

        Collections.sort(lista);

        System.out.println("Lista ordenada por nome: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));

        System.out.println("Lista ordenada por ano: " + lista);

    }
}
