package application;

import entities.Pessoas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somamulheres,mediamulheres,maioraltura, menoraltura;
        int n, qntmulheres,qntdhomens,posicaomenor,posicaomaior;

        System.out.println("Digite a quantidade de pessoas: ");
        n = sc.nextInt();

        Pessoas[] vet = new Pessoas[n];

        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite o genero: ");
            String genero = sc.nextLine();

            vet[i] = new Pessoas(genero, altura);
        }
        //print vetor
        for (Pessoas pes: vet) {
            System.out.println(pes.getAltura() + " " + pes.getGenero());
        }

        // verifica maior altura
        maioraltura = vet[0].getAltura();
        posicaomaior = 0;

        for (int i = 0; i < vet.length ; i++) {
            if(vet[i].getAltura() > maioraltura){
                maioraltura = vet[i].getAltura();
                posicaomaior = i;
            }
        }
        System.out.println("Maior Altura: " + maioraltura);

        // verifica menor altura
        menoraltura = vet[0].getAltura();
        posicaomenor = 0;

        for (int i = 0; i < vet.length ; i++) {
            if(vet[i].getAltura() < menoraltura){
                menoraltura = vet[i].getAltura();
                posicaomenor = i;
            }
        }
        System.out.println("Menor Altura: " + menoraltura);

        //media da altura das mulheres
        somamulheres = 0;
        mediamulheres = 0;
        qntmulheres = 0;
        for (Pessoas mulheres: vet){
            if(mulheres.getGenero().equals("F")){
                somamulheres += mulheres.getAltura();
                qntmulheres++;
            }
        }
        mediamulheres = somamulheres / qntmulheres;
        System.out.printf("Média das alturas das mulheres: %.2f\n",mediamulheres);

        //Quantidade de homens
        qntdhomens = 0;
        for (int i = 0; i < vet.length ; i++) {
            if(vet[i].getGenero().equals("M")){
                qntdhomens++;
            }
        }
        System.out.println("Quantidade de homens: " + qntdhomens);

        sc.close();
    }
}
