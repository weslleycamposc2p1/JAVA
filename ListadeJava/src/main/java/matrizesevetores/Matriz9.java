package matrizesevetores;
import java.util.Scanner;

public class Matriz9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n;
        boolean simetrica = true;

        for (int i = 0; i < 3; i++) {

            for (int p = 0; p < 3; p++) {
                System.out.println("Digite um numero: ");
                n = entrada.nextInt();
                matriz[i][p] = n;
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int p = 0; p < 3; p++) {

                if (matriz[i][p] != matriz[p][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        entrada.close();
    }

}
