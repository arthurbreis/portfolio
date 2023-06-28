package application;

import entities.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos produtos: ");
        int n = sc.nextInt();
        double soma = 0.0;
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length ; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
            soma += vect[i].getPreco();
        }
        double media = soma / n;
        System.out.println("Média dos preços: " + media);



        sc.close();

    }
}
