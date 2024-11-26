package condicionais;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {

                Scanner voto = new Scanner(System.in);

        int idade;

                System.out.println("Digite sua idade");
                idade = voto.nextInt();

        if(idade<16){
            System.out.println("Não vota");
        }else if(idade>=18 && idade <69){
            System.out.println("Voto Obrigatório");
        }else{
            System.out.println("Voto Opcional");
        }



    }
}
