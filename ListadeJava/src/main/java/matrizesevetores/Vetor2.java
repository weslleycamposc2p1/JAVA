package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {


        Scanner soma = new Scanner(System.in);

        int resultado=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <10; n++) {
            System.out.print("Digite um numero: ");
            lista.add(soma.nextInt());
        }

        
        for(int mais:lista){
            resultado+=mais;
        }

        System.out.println(resultado);

    }
}
