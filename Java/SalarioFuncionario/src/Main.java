import entites.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario func = new Funcionario();

        System.out.print("Nome: " );
        func.setName(sc.nextLine());
        System.out.print("Salario Bruto: ");
        func.setSalario(sc.nextDouble());
        System.out.print("Imposto: ");
        func.setImposto(sc.nextDouble());

        System.out.println("Funcionario: " + func);
        System.out.println("Quantos % será o aumento? ");
        double porcentagem = sc.nextDouble();
        func.aumentoSalario(porcentagem);
        System.out.println("Dados atualizado: " + func);
        sc.close();

    }

}
