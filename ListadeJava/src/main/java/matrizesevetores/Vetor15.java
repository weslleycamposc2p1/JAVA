package matrizesevetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Vetor15 {

    public static void main(String[] args) {


        Scanner nomes = new Scanner(System.in);


        List<String> lista = new ArrayList<String>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um nome: ");
            lista.add(nomes.next());
        }



        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);





    }
}
