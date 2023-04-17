package models;

public class Serie extends Titulo{
    private int temporadas, epPorTemporadas, minPorEps;
    private boolean ativa;

    public Serie(String nome, int AnoLancamento) {
        super(nome, AnoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getEpPorTemporadas() {
        return epPorTemporadas;
    }
    public void setEpPorTemporadas(int epPorTemporadas) {
        this.epPorTemporadas = epPorTemporadas;
    }
    public int getMinPorEps() {
        return minPorEps;
    }
    public void setMinPorEps(int minPorEps) {
        this.minPorEps = minPorEps;
    }

    @Override
    public int getDuracao(){

        return temporadas * epPorTemporadas * minPorEps;

    }
}
