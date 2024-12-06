package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor4 {

    public static void main(String[] args) {

        Scanner pares = new Scanner(System.in);

        int par;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um numero: ");

            par = pares.nextInt();
            lista.add(par);
        }

        for(int p: lista) {

            if(p %2 ==0){
                System.out.println(p + " Numero par ");
            }

        }




    }
}
