package application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int qntd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores: ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Digite o valor " + i);
            vet[i] = sc.nextInt();
        }

        System.out.println("\nNumeros Pares:");
        for (int i = 0; i < vet.length ; i++) {
            if(vet[i] % 2 == 0){
                System.out.printf("%d ", vet[i]);
                qntd++;
            }
        }
        System.out.printf("\nQuantidade de pares: " + qntd);


        sc.close();
    }
}
