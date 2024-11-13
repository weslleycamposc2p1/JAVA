package comandoscondicionais;
import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {

        String lanche;
        String combo;

        Scanner burguer = new Scanner(System.in);
        System.out.println("Escolha um combo: ");
        lanche = burguer.nextLine();

        switch (lanche){
            case "combo 1":combo="King Costela, Sanduíche no pão de brioche com hambúrguer de carne bovina grelhada, 2 fatias de queijo sabor cheddar, carne de costela bovina desfiada, chutney de cebola roxa, cebola crispy, 3 anéis de onion rings e maionese de alho. ";
            break;
            case "combo 2":combo="Whopper® Bacon Catupiry®, Com hambúrguer de carne 100% bovina grelhado no fogo como churrasco, bacon crocante, Catupiry, cebola crispy, tomate em fatias e maionese";
            break;
            case "combo 3":combo="Mega Stacker Cheddar 2.0, Duas deliciosas carnes grelhadas no fogo, bacon, muito molho sabor cheddar e molho Stacker";
            break;
            case "combo 4":combo=" Cheddar Duplo! Pão fofinho com gergelim, 2 hambúrgueres de carne 100% bovina grelhados no fogo como churrasco, o novo molho cremoso sabor queijo cheddar e toda a crocância da cebola crispy. ";
            break;
            case "combo 5":combo="Whopper® Vegetariano, 100% Whopper®, 0% carne. Pão com gergelim, maionese, alface, tomate, cebola, ketchup, picles, cheddar fatiado e hambúrguer à base de proteína vegetal.";
            break;
            default:combo="Não temos essa opção!";

        }

        System.out.println(combo);

    }
}
