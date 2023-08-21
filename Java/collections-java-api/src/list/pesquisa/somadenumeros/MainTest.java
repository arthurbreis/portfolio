package list.pesquisa.somadenumeros;

public class MainTest {

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.maiorNumero());

        System.out.println("Menor número = " + somaNumeros.menorNumero());
    }
}
