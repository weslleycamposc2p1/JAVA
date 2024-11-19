package lacosrepeticao;
import java.util.Scanner;

public class DoWhile5 {

    public static void main(String[] args) {

        Scanner tabu = new Scanner(System.in);


        int tabuada;
        System.out.println("Entre com a Tabuada desejada: ");
        tabuada = tabu.nextInt();

        int n=1;
        do{
            System.out.println(tabuada + "x" + n + "= " + (tabuada *n));
            n++;
        }while(n<=10);


    }
}
