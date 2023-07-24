package application;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as informações do Cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Nascimento (DD/MM/YYYY): ");
        Date aniversario = sdf.parse(sc.next());

        Cliente cliente = new Cliente(name, email, aniversario);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Product price: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido it = new ItemPedido(quantidade, precoProduto, produto);

            pedido.addItem(it);
        }

        System.out.println();
        System.out.println(pedido);

        sc.close();



    }
}
