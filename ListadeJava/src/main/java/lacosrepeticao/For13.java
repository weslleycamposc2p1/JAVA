package lacosrepeticao;
import java.util.Scanner;

public class For13 {

    public static void main(String[] args) {


        Scanner separado = new Scanner(System.in);

        int n = 0;
        String numero;


        System.out.println("entre com um numero");
        numero = separado.next();


        for(int cont=0 ;cont<numero.length();cont++){

            System.out.println(numero.charAt(cont));

        }

    }
}
