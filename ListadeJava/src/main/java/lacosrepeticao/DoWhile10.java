package lacosrepeticao;

public class DoWhile10 {

    public static void main(String[] args) {

        int n1=0,n2=1,n=0;

        do{

            n2=n2+n1;
            System.out.println(n2);
            n1+=n2;
            System.out.println(n1);
            n++;
        }while(n<10);



    }
}
