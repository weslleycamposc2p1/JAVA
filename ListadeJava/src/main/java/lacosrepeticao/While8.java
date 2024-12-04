package lacosrepeticao;
import java.util.Scanner;

public class While8 {

    public static void main(String[] args) {

        int n1=0,n2=1;

        while(n2<500){

            n2=n2+n1;
            System.out.println(n2);
            n1+=n2;
            System.out.println(n1);
        }



    }
}
