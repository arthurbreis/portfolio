import entities.ContaCorrente;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entrada = 0;
        String menu = ("""
    1- Nova Conta
	2- Consultar saldo
	3- Depositar
	4- Sacar
	5- Sair
    """);
        ContaCorrente contaCorrente = null;
        Scanner sc = new Scanner(System.in);
        while(entrada != 5){
            System.out.println(menu);
            entrada = sc.nextInt();
            sc.nextLine();

            if (entrada < 0 || entrada > 5){
                System.out.println("Valor inválido, digite novamente");
            }else {
                switch (entrada){
                    case 1:
                        System.out.printf("Deposito inicial? %n 1 - sim %n 2 - não ");
                        entrada = sc.nextInt();
                        sc.nextLine();
                        if (entrada < 1 || entrada > 2){
                            System.out.println("Valor inválido, digite novamente");
                        } else if (entrada == 1){
                            System.out.println("Digite o nome: ");
                            String nome = sc.nextLine();

                            Random random = new Random();
                            int numeroConta = random.nextInt(1000);

                            System.out.println("Digite o valor do depósito inicial: ");
                            double depositoInicial = sc.nextDouble();
                            contaCorrente = new ContaCorrente(nome, numeroConta, depositoInicial);
                            System.out.println(contaCorrente);
                            break;
                        } else {
                            System.out.println("Digite o nome: ");
                            String nome = sc.nextLine();
                            Random random = new Random();
                            int numeroConta = random.nextInt(1000);
                            contaCorrente = new ContaCorrente(nome,numeroConta);
                            System.out.println(contaCorrente);
                            break;
                        }
                    case 2:
                        if(contaCorrente != null){
                        System.out.println("Seu saldo: " + contaCorrente.getSaldo());

                        } else {
                            System.out.println("Não há conta cadastrada!");
                        }
                        break;

                    case 3:
                        if(contaCorrente != null){
                            System.out.println("Digite o valor do depósito: ");
                            double deposito = sc.nextDouble();
                            contaCorrente.deposito(deposito);
                            System.out.println("Saldo atual: " + contaCorrente.getSaldo());

                        } else {
                            System.out.println("Não há conta cadastrada!");
                        }
                        break;

                    case 4:
                        if(contaCorrente != null){
                            System.out.println("Digite o valor do saque: ");
                            double saque = sc.nextDouble();
                            contaCorrente.saque(saque);
                            System.out.println("Saldo atual: " + contaCorrente.getSaldo());

                        } else {
                            System.out.println("Não há conta cadastrada!");
                        }
                        break;

                    default:
                        System.out.println("bye");
                        break;
                }
            }

        }
        sc.close();

    }
}
