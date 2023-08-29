package map.dicionario;

public class MainTest {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Teste","Ato de testar");
        dicionario.adicionarPalavra("Teste2","Ato de testar2");
        dicionario.adicionarPalavra("Teste3","Ato de testar3");
        dicionario.adicionarPalavra("Case4","Ato de testar4");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Teste3");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisaPorPalavra("Case4"));


    }
}
