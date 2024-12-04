package condicionais;
import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        Scanner escola = new Scanner(System.in);



        int aluno;

        System.out.println("Digite o numero de faltas: ");
        aluno = escola.nextInt();

        if(aluno>= 1 && aluno <= 15){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado por faltas");
        }



    }

}
