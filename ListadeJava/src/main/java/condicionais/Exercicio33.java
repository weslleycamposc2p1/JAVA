package condicionais;
import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {

        Scanner horario = new Scanner(System.in);

        String nome;
        char turno;

        System.out.println("Digite seu nome: ");
        nome = horario.nextLine();

        System.out.println("Digite seu turno: ");
        turno = horario.next().toUpperCase().charAt(0);

        if(turno == 'M'  ){
            System.out.println("Bom diaaa " + nome + "!");
        }else if(turno == 'V' ){
            System.out.println("Boa tardeee " + nome + "!");
        }


    }
}
