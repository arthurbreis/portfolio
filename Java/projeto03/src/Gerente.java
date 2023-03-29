public class Gerente extends Funcionario {
    private int senha;
    private double bonus;

    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        System.out.println("calculando bonus gerente...");
        bonus = super.getSalario() * 0.5;
        return bonus;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonus(){
        return this.bonus;
    }
}
