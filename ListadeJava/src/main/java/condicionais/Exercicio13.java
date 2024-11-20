package condicionais;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner multiplo = new Scanner(System.in);


        int n1,n2;

                System.out.println("digite um numero: ");
                n1 = multiplo.nextInt();
                System.out.println("digite um numero: ");
                n2 = multiplo.nextInt();


                if(n1%n2==0){
                    System.out.println("É multiplo");
                }else{
                    System.out.println("Não é multiplo");
                }


    }
}
