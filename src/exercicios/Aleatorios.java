package exercicios;

import java.util.Random;
/*numeros aleatorios e seus sucessores*/
public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }
        System.out.println("Numeros Aleatorios: ");
        for(int numero: numAleatorios){
            System.out.println(numero + " ");
        }
        System.out.println("Sucessores dos Numeros Aleatorios: ");
        for(int numero: numAleatorios){
            System.out.println((numero+1) + " ");
        }

    }

}
