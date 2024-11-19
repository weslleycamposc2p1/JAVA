package lacosrepeticao;
import java.util.Scanner;

public class For6 {

    public static void main(String[] args) {

        float numero;

        Scanner conta = new Scanner(System.in);


        System.out.println("entre com um numero");
        numero = conta.nextFloat();


        for(int contador=1;contador <=numero;contador++){

            if(numero %contador ==0){
                System.out.println("divisor " + contador);
            }
        }


    }
}
