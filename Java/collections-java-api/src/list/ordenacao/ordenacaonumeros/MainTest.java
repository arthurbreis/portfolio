package list.ordenacao.ordenacaonumeros;

public class MainTest {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.print("Lista: ");
        numeros.exibirNumeros();
        System.out.println("Ordenação Ascendente: " + numeros.ordenarAscendente());
        System.out.println("Ordenação Descendente: " + numeros.ordenarDescendente());
    }
}
