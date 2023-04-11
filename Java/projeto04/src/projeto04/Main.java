package projeto04;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String cliente = "Arthur";
		String tipoConta = "Corrente";
		double saldo = 3000.0;
		int entrada = 0;
		String menu = ("""
				
				1- Consultar saldo
				2- Depositar valor
				3- Transferir valor
				4- Sair
				""");
		
		System.out.println("Olá " + cliente + " Escolha a opção desejada em sua conta " + tipoConta);
		
		Scanner scanner = new Scanner(System.in);
        
		while(entrada != 4) {
			System.out.println(menu);
			entrada = scanner.nextInt();
			if (entrada < 0 || entrada > 4) {
				System.out.println("valor inválido, digite novamente");
			}else {
			
			switch (entrada){
			   case 1:
				  System.out.println("Seu saldo: " + saldo);
			      break;
			   case 2:
				   System.out.print("Digite o valor do deposito: ");
				   double valor = scanner.nextDouble();
				   saldo += valor;
				   System.out.println("novo saldo: " + saldo);
				   break;
			   case 3:
				   System.out.print("Digite o valor da transferencia: ");
				   double transfer = scanner.nextDouble();
				   	if(transfer > saldo) {
				   		System.out.println("Valor indisponível para transferencia! Seu saldo atual é: " + saldo);
				   	}else {
				   		saldo -= transfer;
				   		System.out.println("Transferiu " + transfer + " Novo saldo: " + saldo);
				   	}
				   	break;				   		
			   default:
				   System.out.println("bye...");
			      break;
			}	
		}
		}
	}
	}
