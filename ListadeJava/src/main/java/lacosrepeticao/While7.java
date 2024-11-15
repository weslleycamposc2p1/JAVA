package lacosrepeticao;
import java.util.Scanner;

public class While7 {

    public static void main(String[] args) {

        int resultado = 0,numero;
        int n = 2;

        Scanner primo = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        numero = primo.nextInt();


        while (n < numero) {
            resultado = numero % n;
            if (resultado == 0) {
                System.out.println("esse numero não é Primo");
                break;
            }
            else if (n == (numero - 1)) {
                if (resultado != 0) {
                    System.out.println("esse numero é Primo");
                }
            }
            n++;
        }


    }
}
