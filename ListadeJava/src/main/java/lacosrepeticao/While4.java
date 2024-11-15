package lacosrepeticao;
import java.util.Scanner;

public class While4 {

    public static void main(String[] args) {

        int n =1;
        float n1,n2,n3,n4,n5,soma;


        Scanner media = new Scanner(System.in);

        System.out.println("Entre com a nota: ");
        n1 = media.nextFloat();
        System.out.println("Entre com a nota: ");
        n2 = media.nextFloat();
        System.out.println("Entre com a nota: ");
        n3 = media.nextFloat();
        System.out.println("Entre com a nota: ");
        n4 = media.nextFloat();
        System.out.println("Entre com a nota: ");
        n5 = media.nextFloat();

        soma = ((n1+n2+n3+n4+n5) / 5);

        while(n<=5){
            System.out.println("resultado das notas" + "= " + soma);
            n++;
        }


    }
}
