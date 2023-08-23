package set.conjuntopalavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;
    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            palavrasSet.remove(palavra);
        } else {
            System.out.println("Conjunto Vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavras(){
        if(!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        } else {
            System.out.println("Conjunto vazio!");
        }
    }
}
