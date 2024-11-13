package comandoscondicionais;
import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {

        int work;
        String cargo;
        double aumento,salario;

        Scanner programador = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        work = programador.nextInt();

        switch (work) {
            case 1:
                aumento = (1400 * 10)/100; salario = 1400 + aumento;
                cargo ="01 programador estagiário - salário = " + salario + " reais";
            break;

            case 2:
                aumento = (3000 * 12)/100; salario = 3000 + aumento;
                cargo ="02 programador junior - salário = " + salario + " reais";
            break;

            case 3:
                aumento = (5500 * 13)/100; salario = 5500 + aumento;
                cargo ="03 programador pleno - salário = " + salario + " reais";
            break;

            case 4:
                aumento = (8000 * 13)/100; salario = 8000 + aumento;
                cargo ="04 programador senior - salário = " +salario+ " reais";
            break;

            case 5:
                aumento = (12000 * 13)/100; salario = 12000 + aumento;
                cargo ="05 programador master - salário = " +salario+ " reais";
            break;

            default:cargo="Erro";
        }

        System.out.println(cargo);


    }
}
