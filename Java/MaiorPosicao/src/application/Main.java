package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores: ");
        int n = sc.nextInt();

        double vet[] = new double[n];

        for (int i = 0; i <vet.length ; i++) {
            System.out.println("Digite o valor da posição" + i);
            vet[i] = sc.nextDouble();
        }

        double maiorValor = vet[0];
        int posicaoMaior = 0;

        for (int i = 0; i < vet.length ; i++) {
            if (vet [i] > maiorValor){
                maiorValor = vet[i];
                posicaoMaior = i;
            }
        }
        System.out.println("Maior Valor: " + maiorValor);
        System.out.println("Sua posição no vetor: " + posicaoMaior);
        sc.close();
    }
}
