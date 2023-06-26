import java.util.Scanner;
import utils.Conversor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cotação atual do dolar: ");
        double valorDolar = sc.nextDouble();
        System.out.println("Quantidade em dolar: ");
        double qntEmDolar = sc.nextDouble();
        double resultado = Conversor.dolarToReal(qntEmDolar, valorDolar);
        System.out.printf("Valor em reais: %.2f%n", resultado);

        sc.close();
    }
}
