package matrizesevetores;
import java.util.Scanner;

public class Matriz10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int n;
        int soma;

        for (int i = 0; i < 4; i++) {

            for (int p = 0; p < 4; p++) {

                System.out.println("Digite um numero");
                n = entrada.nextInt();
                matriz[i][p] = n;
            }
        }

        for (int p = 0; p < 4; p++) {
            soma = 0;

            for (int i = 0; i < 4; i++) {
                soma += matriz[i][p];
            }
            System.out.println("Soma da coluna " + (p + 1) + ": " + soma);
        }

        entrada.close();
    }
}
