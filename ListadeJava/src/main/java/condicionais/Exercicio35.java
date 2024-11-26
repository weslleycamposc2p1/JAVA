package condicionais;
import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner media = new Scanner(System.in);

        int n1, n2, n3,soma;

        System.out.println("Entre com a primeira nota");
        n1 = media.nextInt();
        System.out.println("Entre com a segunda nota");
        n2 = media.nextInt();
        System.out.println("Entre com a terceira nota");
        n3 = media.nextInt();

        soma = (n1 + n2 + n3) / 3;

        if(soma <7){
            System.out.println(soma + " Você está reprovado! ");
        }else{
            System.out.println(soma + " Você foi aprovado! ");
        }


    }
}
