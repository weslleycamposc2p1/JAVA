package condicionais;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner loja = new Scanner(System.in);


        int quantidade, produto2;
        double codigo, soma;

        System.out.println("1- R$15.67: ");
        System.out.println("2- R$20.21: ");
        System.out.println("3- R$65.90: ");
        System.out.println("4- R$48.00: ");

        System.out.println("Digite o código do produto:");
        produto2 = loja.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = loja.nextInt();

        switch (produto2) {

                case 1 -> codigo = 15.67;

                case 2 -> codigo = 20.21;

                case 3 -> codigo = 65.90;

                case 4 -> codigo = 48.00;
                default ->{
                    System.out.println("Codigo Invalido");return;
                }

        }

        soma = codigo*quantidade;

        System.out.println(" Valor total do produto " + soma);

    }
}
