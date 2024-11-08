public class TesteCaneta {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Esferografico";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        caneta1.tampada = false;

        caneta1.tampar();
        caneta1.estado();
        caneta1.rabiscar();

        System.out.println("");
        System.out.println("");

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "Hidrográfica";
        caneta2.cor = "azul";
        caneta2.ponta = 0.7f;
        caneta2.carga = 40;
        caneta2.tampada = false;

        caneta2.tampar();
        caneta2.estado();
        caneta2.rabiscar();
    }

}
