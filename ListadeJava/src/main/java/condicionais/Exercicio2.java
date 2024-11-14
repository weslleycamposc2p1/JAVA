package condicionais;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        double pi= 3.14, area, perimetro;
        int r;


        Scanner conta = new Scanner(System.in);

        System.out.println("Coloque o raio");
        r = conta.nextInt();

        area = pi*(r*r);
        perimetro=2*pi*r;

        System.out.println("Area igual a " + area);
        System.out.println("Perimetro igual a " + perimetro);


    }
}
