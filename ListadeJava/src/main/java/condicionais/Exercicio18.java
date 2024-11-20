package condicionais;
import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        int n1,n2;

        Scanner maior = new Scanner(System.in);


        System.out.println("Entre com um numero");
        n1 = maior.nextInt();
        System.out.println("Entre com um numero");
        n2 = maior.nextInt();


        if(n1>n2){
            System.out.println(n1 + " é o maior numero");
        }else if(n2>n1){
            System.out.println(n2 + " é o maior numero");
        }




    }
}
