package lacosrepeticao;

import java.util.Scanner;

public class While11 {

    public static void main(String[] args) {

        Scanner par = new Scanner(System.in);


        int numero;
        int cont = 2;
        int soma = 0;

             System.out.println("entre com um numero");
             numero = par.nextInt();

        while(cont<=numero){

            if(cont%2==0){
                soma = cont + soma;
                System.out.println("Soma dos pares " + soma);
            }
            cont ++;
        }


    }
}
