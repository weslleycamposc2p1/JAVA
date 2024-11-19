package lacosrepeticao;
import java.util.Scanner;

public class DoWhile7 {

    public static void main(String[] args) {

        int numero;
        int resultado = 0;
        int cont = 2;


                Scanner entrada = new Scanner(System.in);

        System.out.println("entre com um numero");
        numero = entrada.nextInt();


        do {
            resultado = numero % cont;
            if (resultado == 0) {
                System.out.println("esse numero não é Primo");
                break;
            }
            else if (cont == (numero - 1)) {
                if (resultado != 0) {
                    System.out.println("esse numero é Primo");
                }
            }
            cont++;
        }while (cont < numero);


    }
}
