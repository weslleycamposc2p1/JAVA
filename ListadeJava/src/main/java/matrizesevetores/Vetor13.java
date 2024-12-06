package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor13 {

    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);

        int cont=0;


        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um numero: ");
            lista.add(numeros.nextInt());
        }

        for(int n1:lista) {

            if(n1>10 && n1<50) {
                cont++;
            }
        }

        System.out.println(cont + " numeros entre 10 e 50");


    }
}
