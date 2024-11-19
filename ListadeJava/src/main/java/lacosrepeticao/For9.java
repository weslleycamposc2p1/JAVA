package lacosrepeticao;
import java.util.Scanner;

public class For9 {

    public static void main(String[] args) {

            Scanner usuario = new Scanner(System.in);



            int soma = 0;
            int idade,media;
            String nome;

            for(int cont = 0;cont<5; cont++){


                    System.out.println("Coloque o nome");
                    nome = usuario.nextLine();
                    System.out.println("coloque idade");
                    idade = usuario.nextInt();
                    usuario.nextLine();


            System.out.println(nome +" "+ idade + "\n");

            soma = idade + soma;

            }

         media = soma/5;
        System.out.println("media das idades " +" "+ media);


    }
}
