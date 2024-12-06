package matrizesevetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Vetor6 {

    public static void main(String[] args) {

        Scanner crescendo = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <10; n++) {
            System.out.println("Digite um numero: ");
            lista.add(crescendo.nextInt());

        }


        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);





    }
}
