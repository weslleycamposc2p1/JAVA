package matrizesevetores;
import java.util.Scanner;

public class Matriz5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int n;
        int maior=0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.print("Elemento [" + i + "][" + p + "]: ");
                n = entrada.nextInt();
                matriz[i][p] = n;

                if (n > maior) {
                    maior = n;
                }
            }
        }

        System.out.println("O maior valor presente na matriz é: " + maior);
        entrada.close();
    }


}
