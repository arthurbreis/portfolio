public class CriaConta {
    public static void main(String[] args) {
        
       Conta primeiraConta = new Conta();
       primeiraConta.saldo = 200;
       primeiraConta.agencia = 1234;
       primeiraConta.numero = 12;
       primeiraConta.titular = "Arthur";

       System.out.println(primeiraConta.saldo);

       primeiraConta.saldo += 23;

       System.out.println(primeiraConta.saldo);

    } 
}
