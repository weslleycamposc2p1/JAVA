package condicionais;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {


        int n1,n2,n3,n4,n5,resultado,menor=0,maior=0;

        Scanner media = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        n1 = media.nextInt();
        System.out.println("Digite a sua idade");
        n2 = media.nextInt();
        System.out.println("Digite a sua idade");
        n3 = media.nextInt();
        System.out.println("Digite a sua idade");
        n4 = media.nextInt();
        System.out.println("Digite a sua idade");
        n5 = media.nextInt();


        if(n1>18){
            maior++;
        }else{
            menor++;
        }


        if(n2>18){
            maior++;
        }else{
            menor++;
        }

        if(n3>18){
            maior++;
        }else{
            menor++;
        }

        if(n4>18){
            maior++;
        }else{
            menor++;
        }

        if(n5>18){
            maior++;
        }else{
            menor++;
        }

        System.out.println(menor + " menor de idade");
        System.out.println(maior + " maior de idade");

    }
}
