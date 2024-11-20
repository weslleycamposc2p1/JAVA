package condicionais;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        n = sc.nextInt();

        if(n<0){
            System.out.println("Esse numero é negativo");
        }else if(n==0){
            System.out.println("Esse numero é 0");
        }else{
            System.out.println("Esse numero é positivo");
        }



    }
}
