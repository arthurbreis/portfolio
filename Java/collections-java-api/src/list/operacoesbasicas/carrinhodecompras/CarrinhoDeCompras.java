package list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    protected List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removeItem( String nome){
        List<Item> itemsRemove = new ArrayList<>();
        if(itemList.isEmpty()){
            System.out.println("Lista Vazia");
        }else{
            for (Item i : itemList) {
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemsRemove.add(i);
                }
            }
            itemList.removeAll(itemsRemove);
        }
    }

    public double calcularValorTotal(){
        double valor = 0.0;
        if(itemList.isEmpty()){
            throw new RuntimeException("Lista Vazia");
        } else {
            for (Item i:itemList) {
                double valorItem = i.getPreco() * i.getQnt();
                valor += valorItem;
            }
            return valor;
        }
    }

    public void exibirItens(){
        if(itemList.isEmpty()){
            System.out.println("Lista Vazia");
        }else {
            System.out.println(this.itemList);
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }
}
