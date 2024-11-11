package comandoscondicionais;

import java.util.Scanner;


public class ParouImpar {

    public static void main(String[] args) {

        Scanner parimpar = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = parimpar.nextInt();

        if(numero %2 ==0){
            System.out.println("Numero par!");
        }else{
            System.out.println("Numero impar!");
        }

    }
}

