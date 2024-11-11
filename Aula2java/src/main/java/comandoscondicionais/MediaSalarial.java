package comandoscondicionais;

import java.util.Scanner;

public class MediaSalarial {

    public static void main(String[] args) {

        Scanner saldo = new Scanner(System.in);

        double credito;
        float salario1,salario2,salario3,salario4,salario5,salario6,resultado;

        System.out.println("Qual seu salario1");
        salario1 = saldo.nextFloat();

        System.out.println("Qual seu salario2");
        salario2 = saldo.nextFloat();

        System.out.println("Qual seu salario3");
        salario3 = saldo.nextFloat();

        System.out.println("Qual seu salario4");
        salario4 = saldo.nextFloat();

        System.out.println("Qual seu salario5");
        salario5 = saldo.nextFloat();

        System.out.println("Qual seu salario6");
        salario6 = saldo.nextFloat();

        resultado= (salario1 + salario2 + salario3 + salario4 + salario5 + salario6)/6;


        if(resultado <= 500){
            credito = 0;
        }else if (resultado > 500 && resultado <= 1000){
            credito = (resultado * 0.3);
        }else if (resultado > 1000 && resultado <= 3000){
            credito = (resultado * 0.4);
        }else{
            credito = (resultado * 0.5);
        }

        System.out.println("credito disponivel " + credito);

    }
}
