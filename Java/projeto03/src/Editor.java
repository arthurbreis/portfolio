public class Editor extends Funcionario {
    private int senha;
    private double bonus;

    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        System.out.println("Calculando bonus editor...");
        bonus = super.getSalario() * 0.1;
        return bonus;
    }

    public double getBonus() {
        return bonus;
    }

}