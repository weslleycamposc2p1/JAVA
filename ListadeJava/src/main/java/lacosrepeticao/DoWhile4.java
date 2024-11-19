package lacosrepeticao;
import java.util.Scanner;

public class DoWhile4 {

    public static void main(String[] args) {

        int n=1;
        int nota1,nota2,nota3,nota4,nota5;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com as notas: ");
        nota1 = entrada.nextInt();
        System.out.println("Entre com as notas: ");
        nota2 = entrada.nextInt();
        System.out.println("Entre com as notas: ");
        nota3 = entrada.nextInt();
        System.out.println("Entre com as notas: ");
        nota4 = entrada.nextInt();
        System.out.println("Entre com as notas: ");
        nota5 = entrada.nextInt();

        do{
            System.out.println("resultado das notas" + "= " + (nota1+nota2+nota3+nota4+nota5) / 5);
            n++;
        }while(n<=5);


    }
}
