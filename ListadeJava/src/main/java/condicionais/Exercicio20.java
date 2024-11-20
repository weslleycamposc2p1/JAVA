package condicionais;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        int numero;

        Scanner par = new Scanner(System.in);

        System.out.println("Entre com o numero: ");
        numero = par.nextInt();

        if(numero % 2 == 0){
            System.out.println("número par!!!!");
        }else{
            System.out.println("número ímpar!!!!");
        }


    }
}
