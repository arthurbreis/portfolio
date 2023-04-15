package calculos;

import models.*;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracao();
    }
}
