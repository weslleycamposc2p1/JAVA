package condicionais;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {


        int numero;

        Scanner idade = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        numero = idade.nextInt();

        if (numero < 14) {
            System.out.println("É uma criança");
        }else if(numero >= 14 && numero <22){
            System.out.println("É um adolescente");
        }else if(numero >= 23 && numero <=59){
            System.out.println("É um adulto");
        }else if(numero >= 60){
            System.out.println("É um idoso");
        }


    }
}
