package lacosrepeticao;

import java.util.Scanner;

public class While15 {

    public static void main(String[] args) {

        Scanner pessoa = new Scanner(System.in);

        int n = 0;
        int soma = 0,idade,media,soma2=0;
        String nome;



        while(n<1){

            System.out.println("Coloque o nome");
            nome = pessoa.nextLine();

            switch (nome){
                case "fim":n++;;break;
            }


            if (n == 1) {
                break;
            }


            System.out.println("coloque idade");
            idade = pessoa.nextInt();
            pessoa.nextLine();

            System.out.println(" nome " + nome + " " + " idade " + idade);
            soma = idade + soma;
            soma2++;;
        }

        media = soma/soma2;
        System.out.println("media das idades " + media);



    }
}
