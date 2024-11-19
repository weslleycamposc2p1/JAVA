package lacosrepeticao;
import java.util.Scanner;

public class For7 {

    public static void main(String[] args) {

        float numero;
        float resultado = 0;

                Scanner entrada = new Scanner(System.in);


                System.out.println("entre com um numero");
                numero = entrada.nextFloat();



        for(int cont = 2;cont < numero; cont++) {
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
        }




    }
}
