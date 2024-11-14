package condicionais;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        int area,base,altura;


        Scanner conta = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        altura = conta.nextInt();

        System.out.println("Digite a base");
        base = conta.nextInt();

        area = (base*altura)/2;

        System.out.println("Area igual a: " + area);

    }
}
