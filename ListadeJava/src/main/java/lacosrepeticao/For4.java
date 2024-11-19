package lacosrepeticao;

import java.util.Scanner;

public class For4 {

    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, nota5;

            Scanner media = new Scanner(System.in);


                System.out.println("Entre com as notas: ");
                nota1 = media.nextFloat();
                System.out.println("Entre com as notas: ");
                nota2 = media.nextFloat();
                System.out.println("Entre com as notas: ");
                nota3 = media.nextFloat();
                System.out.println("Entre com as notas: ");
                nota4 = media.nextFloat();
                System.out.println("Entre com as notas: ");
                nota5 = media.nextFloat();

        for(int n=1; n<=5; n++){
            System.out.println("resultado das notas" + "= " + (nota1+nota2+nota3+nota4+nota5) / 5);
        }


    }
}
