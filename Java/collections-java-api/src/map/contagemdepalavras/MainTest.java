package map.contagemdepalavras;

public class MainTest {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavras("Java", 10);
        contagemPalavras.adicionarPalavras("Python", 7);
        contagemPalavras.adicionarPalavras("JavaScript", 1);
        contagemPalavras.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemTotalPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
