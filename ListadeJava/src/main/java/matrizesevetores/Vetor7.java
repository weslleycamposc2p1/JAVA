package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor7 {

    public static void main(String[] args) {

        Scanner positivo = new Scanner(System.in);

        int n1,cont=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <10; n++) {
            System.out.println("Digite um numero: ");
            n1=positivo.nextInt();
            lista.add(n1);
        }

        for(int n2:lista){

            if(n2>0){
                cont++;
            }
        }

        System.out.println(cont + " é positivo");


    }
}
