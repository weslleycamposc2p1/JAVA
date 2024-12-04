package condicionais;

import java.util.Scanner;

public class Exercicio23 {

        public static void main(String[] args) {

            Scanner mouth = new Scanner(System.in);

            String mes;

            System.out.println("Digite um mês: ");
            mes = mouth.nextLine().toLowerCase();

            switch (mes) {
                case "janeiro":
                case "marco":
                case "maio":
                case "julho":
                case "agosto":
                case "outubro":
                case "dezembro":

                    System.out.println("Esse mês tem 31 dias");
                    break;


                case "fevereiro":
                    System.out.println("Esse mês tem 28 ou 29 dias nos anos bissextos");
                    break;


                case "abril":
                case "junho":
                case "setembro":
                case "novembro":
                    System.out.println("Esse mês tem 30 dias");
                    break;


            }


        }
}
