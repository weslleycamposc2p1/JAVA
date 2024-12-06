package matrizesevetores;

import java.util.Scanner;

public class Matriz4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int[][] matriz2 = new int[2][2];

        int [][] soma = new int[2][2];

        System.out.println("digite os numeros");


        for (int n=0 ;n < 2; n++){

            for(int p=0;p<2;p++){
                matriz[n][p] = entrada.nextInt();
            }
        }

        for (int n=0 ;n < 2; n++){

            for(int p=0;p<2;p++){
                matriz[n][p] = entrada.nextInt();
            }
        }

        System.out.println(" \n matriz 2x2 " );

        for (int n=0 ;n < 2; n++){
            for(int p=0;p<2;p++){
                soma[n][p]=matriz[n][p]+matriz2[n][p];
            }
            System.out.println();
        }

        for (int n=0 ;n < 2; n++){
            for(int p=0;p<2;p++){
                System.out.println(soma[n][p] + " ");
            }
            System.out.println();
        }


















    }
}
