package lacosrepeticao;
import java.util.Scanner;

public class While14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n,fator=1,soma=0;

        System.out.println("entre com o fatorial");
        n=entrada.nextInt();

        while(n>1){
            fator*=n;
            n--;

        }

        System.out.println("O fatorial é " + fator);
    }
}
