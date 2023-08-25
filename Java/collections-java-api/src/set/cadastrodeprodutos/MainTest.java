package set.cadastrodeprodutos;

public class MainTest {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionaProduto("Produto 5",1L,15d, 5);
        cadastroProdutos.adicionaProduto("Produto 0",2L,20d, 10);
        cadastroProdutos.adicionaProduto("Produto 3",1L,10d, 2);
        cadastroProdutos.adicionaProduto("Produto 9",9L,  2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
