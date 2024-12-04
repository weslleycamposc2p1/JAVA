package lacosrepeticao;

public class For8 {

    public static void main(String[] args) {


        int n1 = 0;

        for (int n2 = 1; n2 < 500;) {

            n2 = n2 + n1;
            System.out.println(n2);
            n1 += n2;
            System.out.println(n1);

        }


    }
}

