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

        //indexOf
        int posicao = nomes.indexOf("Adamastor");
        System.out.println("Posicao: " + posicao);

        //remoção
        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove(2);
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean existe = nomes.contains("Anderson");

        System.out.println(existe);

        existe = nomes.contains("Adamastor");
        System.out.println(existe);
        boolean vazia = nomes.isEmpty();
        System.out.println(vazia);
//
//        nomes.clear();
//        vazia = nomes.isEmpty();
//        System.out.println(vazia);
        System.out.println("\n");
        for(String nomeDoItem:nomes){
            System.out.println(nomeDoItem);
        }

    }
}
