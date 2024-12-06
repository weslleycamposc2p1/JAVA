package matrizesevetores;

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("digite os numeros");


        for (int n=0 ;n < 2; n++){

            for(int p=0;p<2;p++){
                matriz[n][p] = entrada.nextInt();
                soma += matriz[n][p];
            }
        }

        System.out.println(" \n matriz 2x2 " );

        for (int n=0 ;n < 2; n++){
            for(int p=0;p<2;p++){
                System.out.print(matriz[n][p] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(soma);


    }
}
