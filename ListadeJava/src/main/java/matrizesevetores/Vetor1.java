package matrizesevetores;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Vetor1 {

    public static void main(String[] args) {

        Scanner numeros = new Scanner(System.in);


        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.println("Digite um numero: ");
            lista.add(numeros.nextInt());
        }

        System.out.println(lista);



    }
}
