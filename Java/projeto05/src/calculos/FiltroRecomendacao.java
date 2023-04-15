package calculos;

public class FiltroRecomendacao {

    public void filtra(Classificar classificar) {
        if (classificar.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificar.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}