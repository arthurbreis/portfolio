package utils;

public class Conversor {
    private static final double IOF = 0.06;

    public static double dolarToReal(double qntEmDolar, double valorDolar){
        return  qntEmDolar * valorDolar * (1.0 + IOF);
    }

}
