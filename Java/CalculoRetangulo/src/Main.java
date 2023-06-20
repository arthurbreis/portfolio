import entites.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.print("Digite a altura: ");
        ret.setAltura(sc.nextDouble());

        System.out.print("Digite a largura: ");
        ret.setLargura(sc.nextDouble());

        System.out.println(ret);
        }
}
