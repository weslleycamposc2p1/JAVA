package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor8 {

    public static void main(String[] args) {


        Scanner pn = new Scanner(System.in);



        int n1,par=0,impar=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um numero: ");
            n1=pn.nextInt();
            lista.add(n1);
        }

        for(int p: lista) {

            if(p %2 ==0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.println(par + " Numero par ");
        System.out.println(impar + " Numero impar ");

    }
}
