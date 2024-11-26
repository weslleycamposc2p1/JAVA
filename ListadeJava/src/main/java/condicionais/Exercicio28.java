package condicionais;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        float peso, altura, media;

        Scanner tabela = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        peso = tabela.nextFloat();

        System.out.println("Informe sua altura");
        altura = tabela.nextFloat();

        media = (peso/(altura*altura));;

        System.out.println("Media: " + media);

        if(media <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(media >= 18.6 && media <= 24.9){
            System.out.println("Peso ideal");
        }else if(media >= 25 && media <= 29.9){
            System.out.println("Acima do peso");
        }else if(media >= 30 && media <= 34.9){
            System.out.println("Obesidade grau I");
        }else if(media >= 35 && media <= 39.9){
            System.out.println("Obesidade grau II");
        }else{
            System.out.println("Obesidade grau III");
        }


    }
}
