package matrizesevetores;

import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {

        Scanner terceiro = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int soma = 0;

        System.out.println("digite os numeros");


        for (int n=0 ;n < 3; n++){

            for(int p=0;p<3;p++){
                matriz[n][p] = terceiro.nextInt();

            }
        }

        for(int n=0 ;n < 3; n++){
            soma = soma + matriz[n][n];
        }

        System.out.println(soma);






    }
}
