package entites;

public class Retangulo {
    private double altura, largura;

    public double area (){
        return altura * largura;
    }
    public double perimetro (){
        return 2 * (altura+largura);
    }
    public double diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo: " +
                "AREA= " + area() +
                ", PERIMETRO= " + perimetro() +
                ", DIAGONAL= " + diagonal();
    }
}
