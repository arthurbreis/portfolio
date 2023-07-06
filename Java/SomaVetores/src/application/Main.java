package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores em cada vetor? ");
        int n = sc.nextInt();

        int vetA[] = new int[n];
        int vetB[] = new int[n];
        int vetC[] = new int[n];

        for (int i = 0; i < vetA.length ; i++) {
            System.out.println("Digite os valores do vetor A: ");
            vetA[i] = sc.nextInt();


        }
    }
}
