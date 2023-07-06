package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int media = 0;
        int qntdPares = 0;

        System.out.println("Elementos no vetor: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Digite o valor " + i);
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < vet.length ; i++) {
            if(vet[i] % 2 == 0){
                soma += vet[i];
                qntdPares++;
                media = soma / qntdPares;
            }
        }
        if(media!=0) {
            System.out.println("Media dos pares: " + media);
        }else {
            System.out.println("Nenhum numero par");
        }
        sc.close();
    }
}
