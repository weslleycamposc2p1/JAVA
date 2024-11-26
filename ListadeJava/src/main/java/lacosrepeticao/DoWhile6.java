package lacosrepeticao;
import java.util.Scanner;

public class DoWhile6 {

    public static void main(String[] args) {

        int n, contador = 1;

        Scanner divisor = new Scanner(System.in);

        System.out.println("Entre com um numero");
        n = divisor.nextInt();

        do {

            if (n % contador == 0) {
                System.out.println("Divisor" + contador);
            }
            contador++;
        }while (contador != 0);




    }
}

