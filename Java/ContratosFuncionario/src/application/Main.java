package application;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com nome do Departamento: ");
        String nomeDep = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrab = sc.nextLine();
        System.out.print("Nível: ");
        String nivelTrab = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioB = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrab, NivelTrabalhador.valueOf(nivelTrab),salarioB, new Departamento(nomeDep));

        System.out.print("Quantos contratos? ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Entre com os dados do contrato " + (1+i) + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int hora = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorHora, hora);
            trabalhador.adicionarContrato(contrato);
        }
        System.out.println();
        System.out.print("Entre com Mẽs e ano para calcular o salario (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Salario no " + mesAno + ": " + String.format("%.2f", trabalhador.salario(ano, mes)));

        sc.close();

    }
}
