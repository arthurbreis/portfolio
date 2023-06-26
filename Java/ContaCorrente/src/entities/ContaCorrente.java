package entities;

public class ContaCorrente {
    private String nomeTitular = null;
    private int numeroConta = 0;
    private double depositoInicial, saldo;

    private static final double taxa;

    static {
        taxa = 5.0;
    }

    public ContaCorrente(String nomeTitular, int numeroConta, double depositoInicial){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.depositoInicial = depositoInicial;
        saldo += depositoInicial;
    }

    public ContaCorrente(String nomeTitular, int numeroConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.depositoInicial = depositoInicial;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposito (double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void saque(double valorDoSaque){
        this.saldo -= taxa;
        this.saldo -= valorDoSaque;
    }
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", depositoInicial=" + depositoInicial +
                ", saldo=" + saldo +
                '}';
    }
}
