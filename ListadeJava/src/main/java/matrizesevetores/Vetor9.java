package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor9 {

    public static void main(String[] args) {


        Scanner pn = new Scanner(System.in);



        int n1,positivo=0,negativo=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <10; n++) {
            System.out.println("Digite um numero: ");
            n1=pn.nextInt();
            lista.add(n1);
        }

        for(int n2:lista){

            if(n2>0){
                positivo++;
            }else{
                negativo++;
            }
        }


        System.out.println(positivo + " é positivo");
        System.out.println(negativo + " é negativo");


    }
}

