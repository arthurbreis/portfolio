package set.cadastrodeprodutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionaProduto(String nome,long cod, double preco, int qnt){
        produtoSet.add(new Produto(nome,cod,preco,qnt));
    }
    public Set<Produto> exibeProdutos(){
        return produtoSet;
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutos());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }


}
