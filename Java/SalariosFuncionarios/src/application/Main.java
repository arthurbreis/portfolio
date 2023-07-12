package application;
import entities.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Funcionarios> lista = new ArrayList<>();

        System.out.println("Qual quantidade de funcionarios: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println(" Funcionario #" + (i+1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            while (hasId(lista, id)){
                System.out.println("Id já utilizado, tente novamente: ");
                id = sc.nextInt();
            }

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            Double salario = sc.nextDouble();

            Funcionarios func = new Funcionarios(id, nome, salario);
            lista.add(func);
        }

        System.out.println("Digite ID do funcionario: ");
        int idsalario = sc.nextInt();

        Funcionarios func = lista.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

        if(func == null){
            System.out.println("Id não existe");
        }
        else {
            System.out.println("Entre com a % de reajuste: ");
            double porcentagem = sc.nextDouble();
            func.aumentoSalario(porcentagem);
        }

        System.out.println("Lista de Funcionarios: ");
        for (Funcionarios f: lista){
            System.out.println(f);
        }

        sc.close();

    }

    public static boolean hasId(List<Funcionarios> list, int id){
        Funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
