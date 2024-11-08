package primeiraaulabasico; //pacote(pasta de organização das classes //
import java.util.Scanner;  // referencia a biblioteca Util do java //


public class Atividade2java {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero");
        int numero = entrada.nextInt();

        System.out.println("Entre com o segundo numero");
        int numero2 = entrada.nextInt();

        System.out.println("Entre com o terceiro numero");
        int numero3 = entrada.nextInt();

        System.out.println("Entre com o quarto numero");
        int numero4 = entrada.nextInt();


        int soma = (numero + numero2 + numero3 + numero4)/4;

        System.out.println("O valor do primeiro numero é:" + numero);
        System.out.println("O valor do segundo numero é:" + numero2);
        System.out.println("O valor do terceiro numero é:" + numero3);
        System.out.println("O valor do quarto numero é:" + numero4);
        System.out.println("O valor da media é:" + soma);

    }

}
