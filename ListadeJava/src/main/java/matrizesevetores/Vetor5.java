package matrizesevetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetor5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1;
        int maior=0 ,menor=0;

        List<Integer> lista = new ArrayList<Integer>();
        for (int n = 0; n <5; n++) {
            System.out.print("Digite um numero: ");

            n1 = entrada.nextInt();
            lista.add(n1);
            maior=menor=n1;
        }

        for(int m:lista){

            if(m>maior){
                maior=m;
            }else{
                menor=m;
            }

        }

        System.out.println("Esse numero é o menor " + menor);
        System.out.println("Esse numero é o maior " + maior);



    }
}
