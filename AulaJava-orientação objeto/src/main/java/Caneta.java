public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){

        if (tampada == true){
            System.out.println("Rabiscar impossivel.");
        }
        else{
            System.out.println("Rabiscar viável");
        }
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }

    void estado(){
        System.out.println("Esta caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor : " + cor);
        System.out.println("Esta caneta tem a ponta " + ponta);
        System.out.println("Esta caneta tem a carga: " + carga + "%");
        System.out.println("Esta caneta esta: " + tampada);

    }
}
