package primeiraaulabasico; //pacote(pasta de organização das classes //
import java.util.Scanner;  // referencia a biblioteca Util do java //


public class PrimeiraAula {

    public static void main(String[] args) {  //metodo principal para execução da classe //

        Scanner entrada = new Scanner(System.in); // entrada de dados pelo teclado//

        System.out.println("Entre com o primeiro numero"); //permite a exibição em tela //
        int numero = entrada.nextInt(); //instancia da classe Scanner na variavel //

        System.out.println("Entre com o segundo numero");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2; // instância que atribui calor á soma //

        System.out.println("O valor do primeiro numero é:" + numero); // saida dos dados (estado atual) //
        System.out.println("O valor do segundo numero é:" + numero2);
        System.out.println("O valor do terceiro numero é:" + soma);

    }

}
