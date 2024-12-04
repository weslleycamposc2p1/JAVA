package lacosrepeticao;

public class While10 {

    public static void main(String[] args) {

        int n1=0,n2=1,n=0;

        while(n<10){

            n2=n2+n1;
            System.out.println(n2);
            n1+=n2;
            System.out.println(n1);
            n++;
        }


    }
}
