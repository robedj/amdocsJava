package exercicios;

public class Inversa {
    public static void main(String[] args) {

        int[] vetor = { -2, 0, 8, 13, 9, 85};
        int count = vetor.length - 1;

        System.out.println(vetor.length);

        while(count >= 0){
            System.out.println(vetor[count]+ " ");
            count--;
        }
    }
}
