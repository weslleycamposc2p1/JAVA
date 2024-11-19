package lacosrepeticao;
import java.util.Scanner;

public class While9 {

    public static void main(String[] args) {

        int n = 0;
        int soma = 0,idade,media;
        String nome;

                Scanner pessoas = new Scanner(System.in);

                System.out.println("Coloque o nome");
                nome = pessoas.nextLine();

                System.out.println("coloque idade");
                idade = pessoas.nextInt();
                pessoas.nextLine();


        while(n<5){
            System.out.println(" nome " + nome + " idade " + idade);
            soma = idade + soma;
            n++;
        }

        media = soma/5;
        System.out.println("media das idades " + media);

    }
}
