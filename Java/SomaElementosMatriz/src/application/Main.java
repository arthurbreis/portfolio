package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        int[][] myArray = new int[3][3];

        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0; j < myArray.length ; j++) {
                myArray[i][j] = sc.nextInt();
                soma+=myArray[i][j];
            }
        }
        System.out.println("Soma: " + soma);
        sc.close();

    }
}
