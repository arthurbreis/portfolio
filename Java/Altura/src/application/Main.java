package application;
import entities.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qntd pessoas: ");
        double soma = 0.0;
        double media = 0.0;
        double menores = 0.0;
        double percentMenores = 0.0;
        int n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i <vet.length ; i++) {
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("A idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoa(nome, idade, altura);
            soma += vet[i].getAltura();
        }
        media = soma / n;
        System.out.printf("Altura média: %.2f%n", media);

        for (int i = 0; i < vet.length ; i++) {
             if (vet[i].getIdade() < 16) {
                 menores++;
                 percentMenores = (menores / n) * 100.0;
             }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenores);
        System.out.println("Menores: ");
        for(int i=0; i<n; i++) {
            if (vet[i].getIdade() < 16) {
                System.out.printf("%s\n", vet[i].getNome());
            }
        }

    }
}
