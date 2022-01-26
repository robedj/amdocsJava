package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");

        int tabuada = scan.nextInt();
        int contador;

        for(contador = 1; contador <=10; contador++){
            System.out.println(tabuada + " x " + contador + " = " +(tabuada*contador));
        }

    }
}
