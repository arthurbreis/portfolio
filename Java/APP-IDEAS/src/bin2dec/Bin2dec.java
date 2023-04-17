package bin2dec;

import java.util.Scanner;

public class Bin2dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        boolean valido = false;
        do {
            System.out.print("Digite um número binário de até 8 dígitos: ");
            entrada = scanner.nextLine();
            if (entrada.length() <= 8 && validarBinario(entrada)) {
                valido = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número binário válido de até 8 dígitos.");
            }
        } while (!valido);

        int decimal = converterBinarioParaDecimal(entrada);
        System.out.println("O número decimal equivalente é: " + decimal);

        scanner.close();
    }

    public static boolean validarBinario(String entrada) {
        return entrada.matches("[01]+");
    }

    public static int converterBinarioParaDecimal(String binario) {
        int decimal = 0;
        int tamanho = binario.length() - 1;
        for (int i = 0; i <= tamanho; i++) {
            int digito = Integer.parseInt(binario.substring(i, i + 1));
            decimal += digito * Math.pow(2, tamanho - i);
        }
        return decimal;
    }
}
