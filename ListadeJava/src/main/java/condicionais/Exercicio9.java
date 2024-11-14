package condicionais;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        int deposito;
        double taxa = 0.05,soma,mensal,total;

        Scanner anual = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        deposito = anual.nextInt();

        soma = deposito * taxa;
        mensal = deposito + soma;
        total = mensal * 12;

        /* "\n" pula linha no codigo */

        System.out.println("O valor total do deposito mensal: " + mensal + " e anualmente " + total);
    }
}
