package map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    protected Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
            dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        } else {
            throw new RuntimeException("Dicionario Vazio");
        }
    }
    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
        System.out.println(dicionarioMap);
        } else {
            throw new RuntimeException("Dicionario Vazio");
        }
    }

    public String pesquisaPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
        } else {
            throw new RuntimeException("Palavra não encontrada");
        }
        return definicaoPorPalavra;
    }

}
