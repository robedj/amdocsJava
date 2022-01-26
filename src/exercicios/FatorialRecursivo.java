package exercicios;

import java.util.Scanner;

public class FatorialRecursivo {

    public static int fatorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * fatorial(x - 1);
        }

    }

    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Fatorial: ");

        numero = entrada.nextInt();
        System.out.println("Fatorial de: " + numero+ " = " + fatorial(numero));

    }
}


