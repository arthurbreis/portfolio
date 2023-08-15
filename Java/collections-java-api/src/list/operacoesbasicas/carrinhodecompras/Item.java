package list.operacoesbasicas.carrinhodecompras;

public class Item {
    private String nome;
    private double preco;
    private int qnt;

    public Item(String nome, double preco, int qnt) {
        this.nome = nome;
        this.preco = preco;
        this.qnt = qnt;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQnt() {
        return qnt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qnt=" + qnt +
                '}';
    }
}
