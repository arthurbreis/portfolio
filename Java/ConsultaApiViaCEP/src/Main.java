import java.util.Scanner;
import models.conectaApi;


public class Main {
    private static final int OPCAO_CONSULTAR_CEP = 1;
    private static final int OPCAO_SAIR = 2;

    public static void main(String[] args) {
        conectaApi apiCep = new conectaApi();
        Scanner scanner = new Scanner(System.in);

        exibirMenu();

        int opcao = lerOpcao(scanner);
        while (opcao != OPCAO_SAIR) {
            switch (opcao) {
                case OPCAO_CONSULTAR_CEP:
                    realizarConsultaCep(apiCep, scanner);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            exibirMenu();
            opcao = lerOpcao(scanner);
        }
        System.out.println("Saindo...");
    }
    private static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Consultar CEP");
        System.out.println("2 - Sair");
    }
    private static int lerOpcao(Scanner scanner) {
        System.out.print("Opção: ");
        return scanner.nextInt();
    }
    private static void realizarConsultaCep(conectaApi apiCep, Scanner scanner) {
        System.out.print("Digite o CEP (somente números): ");
        int cep = scanner.nextInt();
        apiCep.setCep(cep);
        apiCep.chamaApi();
        System.out.println("Consulta finalizada.");
    }
}
