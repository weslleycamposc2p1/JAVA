package matrizesevetores;
import java.util.Scanner;

public class Matriz12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n;
        int soma = 1;

        for (int i = 0; i < 3; i++) {

            for (int p = 0; p < 3; p++) {
                n = entrada.nextInt();
                matriz[i][p] = n;
            }
        }

        for (int i = 0; i < 3; i++) {
            soma *= matriz[i][2 - i];
        }

        System.out.println(soma);
        entrada.close();
    }
}
