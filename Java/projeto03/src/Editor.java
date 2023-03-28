public class Editor extends Funcionario {
    private int senha;

    public boolean autentica(int senha) {

        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        System.out.println("Calculando bonus editor...");
        return super.getBonificacao() + 100;
    }
}