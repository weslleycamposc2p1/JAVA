package condicionais;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner aumento = new Scanner(System.in);

        double numero,soma;


        System.out.println("Digite seu salário: ");
        numero = aumento.nextDouble();

        soma = numero*0.15;
        soma = soma + numero;

        System.out.printf("Seu novo salário R$%.2f" , soma);

    }
}
