package application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        System.out.println("Digite numero de linhas e colunas da matriz: ");
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sc.nextLine();
                System.out.println("digite o valor da posição " + (i) + ":" + (j));
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Digite um valor da matrix: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + ":" + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);
                    }
                    if (j < m - 1) {
                        System.out.println("Direita: " + mat[i][j + 1]);
                    }
                    if (i < n - 1) {
                        System.out.println("Baixo: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}