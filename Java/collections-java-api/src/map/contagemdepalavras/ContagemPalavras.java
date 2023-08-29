package map.contagemdepalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    protected Map<String, Integer> contagemMap;
    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        contagemMap.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if(!contagemMap.isEmpty()){
        contagemMap.remove(palavra);
    } else {
            throw new RuntimeException("Map vazio");
        }
    }
    public int exibirContagemTotalPalavras(){
        int total = 0;
        if(!contagemMap.isEmpty()){
            for (int contagem: contagemMap.values()) {
                total += contagem;

            }
        }
    return total;
    }

    public String encontrarPalavraMaisFrequente(){
        String frequencia = null;
        int maior = 0;
        for (Map.Entry<String, Integer> entry: contagemMap.entrySet()) {
            if(entry.getValue() > maior){
                maior = entry.getValue();
                frequencia = entry.getKey();
            }
        }
        return frequencia;
    }
}
