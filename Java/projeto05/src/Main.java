public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top gun");
        meuFilme.setAnoLancamento(2022);
        meuFilme.setDuracao(120);

        meuFilme.fichaTecnica();

        meuFilme.avalia(10);
        meuFilme.avalia(20);

        System.out.println(meuFilme.getTotalAvaliacoes());

        System.out.println(meuFilme.mediaAvaliacoes());

    }
}
