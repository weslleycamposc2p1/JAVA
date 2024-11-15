package lacosrepeticao;
import java.util.Scanner;

public class While6 {

    public static void main(String[] args) {

        int contador=1,numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com um numero");
        numero = sc.nextInt();


        while(contador <= numero){

            if(numero % contador ==0){
                System.out.println("divisor " + contador);
            }
            contador++;
        }


    }
}


