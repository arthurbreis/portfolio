public class CriaConta {
    public static void main(String[] args) {
        //DEFINE CLIENTE
        Cliente arthur = new Cliente();
        arthur.setNome("Arthur");
        arthur.setCpf ("1234567890");
        //DEFINE CONTA 
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        primeiraConta.setAgencia(1234);
        primeiraConta.setNumero(12);
        //SETA TITULAR
        primeiraConta.setTitular(arthur);

        System.out.println(primeiraConta.getTitular().getNome());

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(23);

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.saca(100);

        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(200);

        if (segundaConta.transfere(150, primeiraConta)) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Transferência não realizada!");
        }

        System.out.println(primeiraConta.getSaldo());
        System.out.println(segundaConta.getSaldo());
    }
}
