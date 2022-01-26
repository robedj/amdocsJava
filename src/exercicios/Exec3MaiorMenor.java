package exercicios;

import java.util.Scanner;

public class Exec3MaiorMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int cont = 0;
        int media = 0;
        do{
            System.out.println("Informe o Numero: ");
            numero = scan.nextInt();

            if(numero > maior)
                maior = numero;

            media += numero;

            cont++;
        }while(cont <5);
        System.out.println("O maior numero é: "+maior);
        System.out.println("Media: "+media/5);

    }
}
