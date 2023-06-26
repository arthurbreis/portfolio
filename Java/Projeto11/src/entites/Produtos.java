package entites;

public class Produtos {
    private final String nome;
    private static Double preco;
    private static int quantidade;

    public Produtos(String nome){
        this.nome = nome;
    }
    public static double valorTotalEstoque(){
        return preco*quantidade;
    }
    public static void addProduto(int quantidade){

        Produtos.quantidade += quantidade;
    }
    public static void removeProduto(int quantidade){

        Produtos.quantidade -= quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome= '" + nome + '\'' +
                ", preco= " + preco +
                ", quantidade= " + quantidade +
                '}';
    }
}
