package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor10 {

    public static void main(String[] args) {

        Scanner estado = new Scanner(System.in);

        int n1;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um numero: ");
            n1 = estado.nextInt();
            lista.add(n1);
        }

        for(int neutro:lista){
            if(neutro==0){
                System.out.println(neutro + " É igual a 0");
            }
        }






    }
}
