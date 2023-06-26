import entites.Produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int entrada = 0;
        String menu = ("""
	1- Criar produto
	2- adicionar
	3- remover
	4- Valor total estoque
	5- Sair
""");
        Scanner sc = new Scanner(System.in);

        while(entrada != 5) {
            System.out.println(menu);
            entrada = sc.nextInt();
            sc.nextLine();



            if (entrada < 0 || entrada > 5) {
                System.out.println("valor inválido, digite novamente");
            }else {
                switch (entrada) {
                    case 1:
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        Produtos produtos = new Produtos(nome);

                        System.out.println("Valor: ");
                        produtos.setPreco(sc.nextDouble());

                        System.out.println("Quantidade: ");
                        produtos.setQuantidade(sc.nextInt());
                        Produtos.addProduto(produtos.getQuantidade());

                        System.out.println(produtos);
                        break;
                    case 2:
                        System.out.print("Digite quantidade adicionada ao estoque: ");
                        Produtos.addProduto(sc.nextInt());
                        System.out.println(Produtos.class);
                        break;
                    case 3:
                        System.out.print("Digite quantidade a ser removida: ");
                        Produtos.removeProduto(sc.nextInt());
                        System.out.println(Produtos.class);
                        break;
                    case 4:
                        System.out.println(Produtos.valorTotalEstoque());
                        break;
                    default:
                        System.out.println("bye...");
                        break;
                }
            }
        }
        sc.close();

    }
}