package condicionais;
import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a,b,c;
        int maior,meio,menor;

                System.out.println("Digite um numero a");
                a = sc.nextInt();

                System.out.println("Digite um segundo numero b");
                b = sc.nextInt();

                System.out.println("Digite um terceiro numero");
                c = sc.nextInt();



        if((a>b) && (a>c)){
            maior=a;
        }
        else if((b>a) && (b>c)){
            maior=b;
        }
        else{
            maior=c;
        }


        if((a<b) && (a<c)){
            menor=a;
        }
        else if((b<a) && (b<c)){
            menor=b;
        }
        else{
            menor=c;
        }


        if((a>menor) && (a<maior)){
            meio=a;
        }

        else if((b>menor) && (b<maior)){
            meio=b;
        }

        else{
            meio=c;
        }

        System.out.println(" ordem crescente: " + menor + " " + meio + " " + maior);



    }
}
