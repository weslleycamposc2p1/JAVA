package lacosrepeticao;

import java.util.Scanner;

public class DoWhile13 {

    public static void main(String[] args) {

        Scanner separado = new Scanner(System.in);

        int n = 0, cont=0 ;
        String numero;


        System.out.println("entre com um numero");
        numero = separado.next();


        do{

            System.out.println(numero.charAt(cont));
            cont++;
        }while(cont<numero.length());



    }
}
