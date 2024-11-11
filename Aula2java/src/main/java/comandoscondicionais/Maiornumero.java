package comandoscondicionais;

import java.util.Scanner;

public class Maiornumero {

    public static void main(String[] args) {

        Scanner maior = new Scanner(System.in);

        int n, n2, n3;

        System.out.println("insira o primeiro numero");
        n = maior.nextInt();

        System.out.println("insira o segundo numero");
        n2 = maior.nextInt();

        System.out.println("insira o terceiro numero");
        n3 = maior.nextInt();


        if(n > n2 && n > n3){
            System.out.println(n + " é o maior numero");
        }else if (n2 > n && n2 > n3){
            System.out.println(n2 + " é o maior numero");
        }else{
            System.out.println(n3 + " é o maior numero");
        }


    }
}

