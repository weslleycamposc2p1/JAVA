package condicionais;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int n,n2;
        int soma,subtracao,multiplicacao,divisao;

        Scanner conta = new Scanner(System.in);

        System.out.println("Entre com o numero 1");
        n = conta.nextInt();
        System.out.println("Entre com o numero 2");
        n2 = conta.nextInt();

        soma = n + n2;
        subtracao = n - n2;
        multiplicacao = n * n2;
        divisao = n / n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}
