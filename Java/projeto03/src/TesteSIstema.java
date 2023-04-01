public class TesteSIstema {
    public static void main(String[] args){
        Gerente g = new Gerente();
        g.setSenha(369);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Administrador adm = new Administrador();
    }
}
