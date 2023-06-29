package application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores: ");
        int n = sc.nextInt();
        double soma = 0.0;
        double media = 0.0;

        double[] vect = new double[n];

        for (int i = 0; i <vect.length ; i++) {
            sc.nextLine();
            System.out.println("Digite os valores: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
            media = soma/vect.length;
        }
        System.out.println("Valores digitados : " + Arrays.toString(vect));
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        sc.close();
    }
}
