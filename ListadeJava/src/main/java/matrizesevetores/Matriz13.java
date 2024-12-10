package matrizesevetores;
import java.util.Scanner;

public class Matriz13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int n;
        int maior;

        for (int i = 0; i < 4; i++) {

            for (int p = 0; p < 4; p++) {
                System.out.println("Digite um numero: ");
                n = entrada.nextInt();
                matriz[i][p] = n;
            }
        }

        for (int i = 0; i < 4; i++) {
            maior = matriz[i][0];

            for (int p = 1; p < 4; p++) {

                if (matriz[i][p] > maior) {
                    maior = matriz[i][p];
                }
            }
            System.out.println("Maior valor da linha " + (i + 1) + ": " + maior);
        }

        entrada.close();

    }
}
