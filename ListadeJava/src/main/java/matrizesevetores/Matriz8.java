package matrizesevetores;
import java.util.Scanner;

public class Matriz8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n;
        int menor = 0;

        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.println("Digite um numero: ");
                n = entrada.nextInt();

                matriz[i][p] = n;
                if (n < menor) {
                    menor = n;
                }
            }
        }

        System.out.println(menor);
        entrada.close();
        

    }
}
