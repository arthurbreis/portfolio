public class TestaRegistros {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSalario(5000.0);

        Funcionario editor= new Editor();
        editor.setSalario(2500.0);

        CalculoBonus controle = new CalculoBonus();
        controle.registra(gerente);
        controle.registra(editor);

        System.out.println("custo total bonus: " + controle.getSoma());

    }

}