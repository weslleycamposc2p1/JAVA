package lacosrepeticao;
import java.util.Scanner;

public class DoWhile11 {

    public static void main(String[] args) {

        int numero;
        int resultado = 0;
        int cont = 2;
        int soma = 0;

              Scanner pares = new Scanner(System.in);


             System.out.println("entre com um numero");
             numero = pares.nextInt();
        do{

            if(cont%2==0){
                soma = cont + soma;
                System.out.println("Soma dos pares " + soma);
            }
            cont ++;

        }while(cont<=numero);


    }
}
