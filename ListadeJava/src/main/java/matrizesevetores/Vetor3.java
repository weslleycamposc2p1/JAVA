package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <7; n++) {
            System.out.println("Digite um numero: ");
            int sm = entrada.nextInt();
            soma += sm;
            lista.add(sm);
        }

        System.out.println(soma/7);

    }
}
