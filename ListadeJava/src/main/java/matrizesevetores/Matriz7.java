package matrizesevetores;
import java.util.Scanner;

public class Matriz7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produto = new int[2][2];
        int n;

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {
                n = entrada.nextInt();
                matriz1[i][p] = n;
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {
                n = entrada.nextInt();
                matriz2[i][p] = n;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {
                produto[i][p] = matriz1[i][0] * matriz2[0][p] + matriz1[i][1] * matriz2[1][p];
            }
        }

        System.out.println("Produto das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {
                System.out.print(produto[i][p] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }

}
