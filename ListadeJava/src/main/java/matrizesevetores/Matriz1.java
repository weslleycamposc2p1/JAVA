package matrizesevetores;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("digite os numeros");


        for (int n=0 ;n < 3; n++){

            for(int p=0;p<3;p++){
                matriz[n][p] = entrada.nextInt();

            }
        }

        System.out.println(" \n matriz 3x3 " );

        for (int n=0 ;n < 3; n++){
            for(int p=0;p<3;p++){
                System.out.print(matriz[n][p] + "\t");
            }
            System.out.println();
        }


    }
}
