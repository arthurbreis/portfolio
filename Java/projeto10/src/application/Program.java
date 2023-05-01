package application;

import entities.Triangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        System.out.println("Entre com valores do triagulo X: ");
        x.setA(sc.nextDouble());
        x.setB(sc.nextDouble());
        x.setC(sc.nextDouble());

        Triangulo y = new Triangulo();
        System.out.println("Entre com valores do triagulo Y: ");
        y.setA(sc.nextDouble());
        y.setB(sc.nextDouble());
        y.setC(sc.nextDouble());


        double areaX = x.calculoArea();
        double areaY = y.calculoArea();

        System.out.printf("Area triangulo X: %.4f%n", areaX);
        System.out.printf("Area triangulo y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area X maior que Y ");
        } else {
            System.out.println("Area Y maior que X");
        }
        sc.close();

    }
}
