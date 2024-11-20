package condicionais;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner salario = new Scanner(System.in);

        int n1;
        double mais= 0.10,menos = 0.05,soma,soma2;


        System.out.println("Digite seu salario");
        n1 = salario.nextInt();


        soma = n1*mais;
        mais = n1 + soma;

        soma2 = n1*menos;
        menos = n1 + soma;

        if(n1>2000){
            System.out.println("Bonus de 10% = " + mais);
        }else if(n1<2000){
            System.out.println("Bonus de 5% = " + menos);
        }



    }
}
