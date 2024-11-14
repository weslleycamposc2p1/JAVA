package condicionais;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        int salario;
        double comissao= 0.05,soma,total;



        Scanner conta = new Scanner(System.in);

        System.out.println("informe seu salario: ");
        salario = conta.nextInt();

        soma = salario * comissao;
        total = soma + salario;


        System.out.println("Salario base com comissão " +  total);

    }
}
