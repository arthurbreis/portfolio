package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, maioridade, posmaior;
        System.out.println("Digite quantas pessoas: ");
         n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length ; i++) {
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            vet[i] = new Pessoa(nome, idade);
        }

        maioridade = vet[0].getIdade();
        posmaior = 0;

        for (int i = 0; i < vet.length ; i++) {
            if (vet[i].getIdade() > maioridade) {
                maioridade = vet[i].getIdade();
                posmaior = i;
            }
        }
        System.out.println("Mais velho: " + vet[posmaior].getNome());

        sc.close();
    }
}
