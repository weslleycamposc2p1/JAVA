package lacosrepeticao;
import java.util.Scanner;

public class While5 {

    public static void main(String[] args) {

        int n=1,n1,soma;


        Scanner tabuada = new Scanner(System.in);

        System.out.println("Escolha a tabuada: ");
        n1 = tabuada.nextInt();




        while(n <= 10){
            soma = n1*n;
            System.out.println(n1 + " x " + n + " = " + soma);
            n++;
        }

    }
}
