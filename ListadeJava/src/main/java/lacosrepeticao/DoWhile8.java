package lacosrepeticao;

public class DoWhile8 {

    public static void main(String[] args) {

        int n1=0,n2=1;

        do{

            n2=n2+n1;
            System.out.println(n2);
            n1+=n2;
            System.out.println(n1);
        }while(n2<500);


    }
}
