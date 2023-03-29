public class CalculoBonus {
    private double soma;
    private double bonus;

    public void registra(Funcionario f) {
        bonus = f.getBonificacao();
        this.soma = this.soma + bonus;
    }

    public double getSoma() {
        return soma;
    }
}
