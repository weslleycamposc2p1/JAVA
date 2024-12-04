package condicionais;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner fruta = new Scanner(System.in);

        int maca;

        System.out.println("Digite o numero de maçãs: ");
        maca = fruta.nextInt();


        if(maca <12){
            System.out.println(maca*0.50);
        }else{
            System.out.println(maca*0.40);
        }



    }
}
