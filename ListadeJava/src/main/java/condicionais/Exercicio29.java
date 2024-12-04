package condicionais;
import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner escola = new Scanner(System.in);

        String nome;
        int nota;

        System.out.println("Digite o nome do aluno: ");
        nome = escola.nextLine();

        System.out.println("Digite a nota do aluno: ");
        nota = escola.nextInt();

        if (nota >= 7 && nota <= 10){
            System.out.println(nome + " está aprovado");
        }else{
            System.out.println(nome + " está reprovado");
        }



    }
}
