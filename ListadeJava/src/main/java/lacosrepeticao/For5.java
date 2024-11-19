package lacosrepeticao;
import java.util.Scanner;

public class For5 {

    public static void main(String[] args) {

        int tabuada;

                Scanner entrada = new Scanner(System.in);


                System.out.println("Entre com a Tabuada desejada: ");
                tabuada = entrada.nextInt();


        for(int n=1; n<=10;n++){
            System.out.println(tabuada + "x" + n + "= " + (tabuada *n));
        }


    }
}
