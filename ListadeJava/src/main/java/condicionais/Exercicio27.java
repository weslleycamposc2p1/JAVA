package condicionais;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {


        Scanner genero = new Scanner(System.in);

        int idade;
        char sexo;

        System.out.println("Digite sua idade: ");
        idade = genero.nextInt();

        System.out.println("Digite sexo: ");
        sexo = genero.next().toUpperCase().charAt(0);

        if(sexo == 'M' && idade >= 65 ){
            System.out.println("Pode se aposentar");
        }else if(sexo == 'F' && idade >= 60){
            System.out.println("Pode se aposentar");
        }else{
            System.out.println("Não pode se aposentar");
        }


    }
}
