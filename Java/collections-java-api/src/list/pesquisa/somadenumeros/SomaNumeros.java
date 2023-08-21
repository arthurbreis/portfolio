package list.pesquisa.somadenumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero:numeros) {
            soma += numero;
        }
    return soma;
    }

    public int maiorNumero(){
        int maior = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero >= maior){
                    maior = numero;
                }
            }
            return maior;
        } else throw new RuntimeException("Lista vazia");
    }

    public int menorNumero(){
        int menor = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros) {
                if (numero <= menor){
                    menor = numero;
                }
            }
            return menor;
        } else throw new RuntimeException("Lista vazia");
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else System.out.println("lista vazia");
    }

}
