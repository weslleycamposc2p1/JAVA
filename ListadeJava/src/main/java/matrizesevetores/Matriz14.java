package matrizesevetores;
import java.util.Scanner;

public class Matriz14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n;
        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {

                System.out.println("Digite um numero: ");
                n = entrada.nextInt();
                matriz[i][p] = n;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {

                if ((i == p && matriz[i][p] != 1) || (i != p && matriz[i][p] != 0)) {
                    identidade = false;
                    break;
                }
            }
        }


        if (identidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz não é identidade.");
        }

        entrada.close();
    }
}
