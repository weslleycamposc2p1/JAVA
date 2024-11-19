package lacosrepeticao;
import java.util.Scanner;

public class DoWhile9 {

    public static void main(String[] args) {


        int cont = 0;
        int soma = 0,idade;
        String nome;

                Scanner pessoas = new Scanner(System.in);

        do{

            System.out.println("Coloque o nome");
            nome = pessoas.next();

            System.out.println("coloque idade");
            idade = pessoas.nextInt();
            pessoas.nextLine();

            System.out.println(" nome " + nome + " idade " + idade);

            soma = idade + soma;
            cont++;
        }while(cont<5);

        int media = soma/5;
        System.out.println("media das idades " + media);


    }
}
