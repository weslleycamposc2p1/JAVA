package lacosrepeticao;
import java.util.Scanner;

public class For11 {

    public static void main(String[] args) {


        Scanner pares = new Scanner(System.in);


        int numero;
        int resultado = 0;
        int soma = 0;

        System.out.println("entre com um numero");
        numero=pares.nextInt();

        for(int cont = 2;cont <=numero;cont ++ ){

            if(cont%2==0){
                soma = cont + soma;
                System.out.println("Soma dos pares " + soma);
            }
        }



    }
}
