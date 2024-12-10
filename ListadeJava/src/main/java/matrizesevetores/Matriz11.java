package matrizesevetores;
import java.util.Scanner;

public class Matriz11 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int n;
        boolean igual = true;

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                n = entrada.nextInt();
                matriz1[i][j] = n;
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                n = entrada.nextInt();
                matriz2[i][j] = n;
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                if (matriz1[i][j] != matriz2[i][j]) {
                    igual = false;
                    break;
                }
            }
        }

        if (igual) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }

        entrada.close();


    }
}
