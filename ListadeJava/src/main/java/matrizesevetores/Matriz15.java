package matrizesevetores;
import java.util.Scanner;

public class Matriz15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];

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
                resultado[i][p] = matriz1[i][p] - matriz2[i][p];
            }
        }

        System.out.println("Resultado da subtração das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int p = 0; p < 2; p++) {
                System.out.print(resultado[i][p] + " ");
            }
            System.out.println();
        }

        entrada.close();

    }
}
