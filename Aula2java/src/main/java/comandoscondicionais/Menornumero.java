package comandoscondicionais;

import java.util.Scanner;

public class Menornumero {

    public static void main(String[] args) {

    Scanner menor = new Scanner(System.in);

     int n, n2, n3;

        System.out.println("insira o primeiro numero");
        n = menor.nextInt();

        System.out.println("insira o segundo numero");
        n2 = menor.nextInt();

        System.out.println("insira o terceiro numero");
        n3 = menor.nextInt();


        if(n < n2 && n < n3){
            System.out.println(n + " é o menor numero");
        }else if (n2 < n && n2 < n3){
            System.out.println(n2 + " é o menor numero");
        }else{
            System.out.println(n3 + " é o menor numero");
        }


    }
}
