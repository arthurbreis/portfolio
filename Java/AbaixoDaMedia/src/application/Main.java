package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media = 0;

        System.out.println("Quantos elementos: ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Digite o valor " + i);
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        media = soma / vet.length;
        System.out.printf("media do vetor: %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vet.length ; i++) {
            if(vet[i] < media){
                System.out.printf("%.1f%n",vet[i]);
            }
        }
        sc.close();
    }
}
