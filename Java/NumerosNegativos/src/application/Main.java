package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de valores: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros Negativos no vetor: ");
        for (int j : vect) {
            if (j < 0) System.out.printf("%d\n", j);
        }
        sc.close();
    }
}
