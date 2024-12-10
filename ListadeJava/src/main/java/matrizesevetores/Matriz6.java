package matrizesevetores;
import java.util.Scanner;

public class Matriz6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int n;
        int soma = 0;
        int resultado = 16;

        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 4; p++) {
                System.out.println("Digite um numero: ");
                n = entrada.nextInt();
                matriz[i][p] = n;
                soma += n;
            }
        }

        double media = (double) soma / resultado;
        System.out.println(media);
        entrada.close();
    }

}
