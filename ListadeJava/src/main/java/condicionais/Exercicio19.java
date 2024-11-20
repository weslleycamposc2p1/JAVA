package condicionais;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        int n1,n2,n3;

        float soma;

        Scanner media = new Scanner(System.in);

        System.out.println("Entre com a nota 1");
        n1 = media.nextInt();
        System.out.println("Entre com a nota 2");
        n2 = media.nextInt();
        System.out.println("Entre com a nota 3");
        n3 = media.nextInt();

        soma = (n1 + n2 + n3)/3;

        if(soma >=7){
            System.out.println(soma + " você foi aprovado");
        }else{
            System.out.println(soma + " você foi reprovado");
        }

    }
}
