package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();
        double sum = 0.0;
        double[] vect = new double[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Digite a altura: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double avg  = sum / n;
        System.out.printf("Altura Média: %.2f%n", avg);
        sc.close();

    }
}
