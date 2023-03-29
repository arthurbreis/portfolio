public class Testafuncionario {
    public static void main(String[] args) {
        Funcionario fun01 = new Gerente();
        fun01.setNome("João");
        fun01.setCpf("23213213-1");
        fun01.setSalario(1000.00);

        System.out.println(fun01.getNome());
        System.out.println(fun01.getBonificacao());
    }
}

