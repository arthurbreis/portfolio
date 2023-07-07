package application;
import java.util.Scanner;
import entities.Alunos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma, media;
        double aprovado = 6.0;

        System.out.println("Digite a quantidade de alunos: ");
        int n = sc.nextInt();

        Alunos[] vet = new Alunos[n];

        for (int i = 0; i < vet.length; i++) {
            sc.nextLine();
            System.out.println("Digite Nome, nota 1 e nota 2: ");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vet[i] = new Alunos(nome, nota1, nota2);
        }
        System.out.println("Alunos Aprovados: ");
        soma = 0;
        media = 0;
        for (int i = 0; i < vet.length ; i++) {
            soma = vet[i].getNota1() + vet[i].getNota2();
            media = soma / 2;
            if(media >= aprovado){
                System.out.println(vet[i].getNome());
            }
        }
    }
}
