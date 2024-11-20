package condicionais;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int anos, meses, dias, soma;


        System.out.print("Digite seu ano de nascimento");
        anos = entrada.nextInt();
        System.out.print("Digite seu mes");
        meses = entrada.nextInt();
        System.out.print("Digite seu dias");
        dias = entrada.nextInt();

        soma = (anos * 365) + (meses * 30) + dias;

        System.out.println("dias de vida" + " " + soma);

    }
}
