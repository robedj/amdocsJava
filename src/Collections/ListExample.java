package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> nomes =  new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Adamastor");
        nomes.add("Abilio");
        nomes.add("Theo");

        System.out.println(nomes);
        //Impressao Ordenada
        Collections.sort(nomes);
        System.out.println(nomes);
        //atribuir outro valor a lista na posicao dada
        nomes.set(2, "Larissa");
        System.out.println(nomes);
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        //remoção
        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove(2);
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

    }
}
