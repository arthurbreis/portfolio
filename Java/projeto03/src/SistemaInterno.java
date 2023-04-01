public class SistemaInterno {

    private int senha = 369;
    
    public void autentica(Gerente g){
       boolean auth = g.autentica(this.senha);

       if(auth){
            System.out.println("Autenticado!");
       } else {
            System.out.println("Error: Não Autenticado!");
       }
    }
}
