package condicionais;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        int p,c;
        double desconto=0.1, soma;
        double valor,total;

        Scanner conta = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        p=conta.nextInt();
        System.out.println("Digite a quantidade da compra: ");
        c=conta.nextInt();

        soma = p*c;
        valor = (p*c)*0.1;
        total = soma - valor;

        if(c>9){
            System.out.println("total " + total);
        }else{
            System.out.println("total " + soma);
        }

    }
}
