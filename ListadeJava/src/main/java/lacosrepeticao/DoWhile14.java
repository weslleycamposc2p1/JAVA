package lacosrepeticao;
import java.util.Scanner;

public class DoWhile14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n,fator=1,soma=0;

        System.out.println("entre com o fatorial");
        n=entrada.nextInt();

        do{
            fator*=n;
            n--;

        }while(n>1);

        System.out.println("O fatorial é " + fator);


    }
}
