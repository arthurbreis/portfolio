package Test;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArray {
    public static void main(String[] args) {

        //Criação de array

        ArrayList<String> lista = new ArrayList<>();
        lista.add("teste4");
        lista.add("teste1");
        lista.add("teste2");
        lista.add("teste3");

        System.out.println(lista);
        
        // ordenação da lista

        Collections.sort(lista);

        System.out.println(lista);
        
    }
}
