package condicionais;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        int n;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        n = entrada.nextInt();

        if(n % 2 == 0){
            System.out.println("número par!!");
        }else{
            System.out.println("número ímpar!");
        }


    }
}
