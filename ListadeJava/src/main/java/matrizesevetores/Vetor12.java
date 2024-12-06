package matrizesevetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Vetor12 {

    public static void main(String[] args) {


            Scanner decrescendo = new Scanner(System.in);

            List<Integer> lista = new ArrayList<Integer>();
            for (int n = 0; n <5; n++) {
                System.out.println("Digite um numero: ");
                lista.add(decrescendo.nextInt());

            }


            System.out.println(lista);
            Collections.sort(lista, Collections.reverseOrder());
            System.out.println(lista);


    }
}
