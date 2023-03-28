public class TesteGerente {
        public static void main(String[] args)
        {
            Gerente g = new Gerente();
            g.setNome("Gerente");
            g.setCpf("323231232");
            g.setSalario(50000);

            g.setSenha(222);
            System.out.println(g.getNome());
            System.out.println(g.autentica(222));
            System.out.println(g.getBonificacao());
        }
}
