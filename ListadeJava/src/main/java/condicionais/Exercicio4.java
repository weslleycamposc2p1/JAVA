package condicionais;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int n,n2,n3;
        int soma;

        Scanner conta = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        n=conta.nextInt();
        System.out.println("Digite a nota 2");
        n2=conta.nextInt();
        System.out.println("Digite a nota 3");
        n3=conta.nextInt();

        soma=((n*2)+(n2*3)+(n3*5))/10;

        System.out.println("Resultado: " + soma);

    }
}
