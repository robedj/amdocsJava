package exercicios;
import java.util.Scanner;

public class Exec4_ParImpar {
    public static void main(String[] args) {
        System.out.println("Quantidade de numeros: ");

        Scanner scan = new Scanner(System.in);
        int qtNum = scan.nextInt();
        int contPar = 0;
        int contImpar = 0;
        int i = 0;
        int num = 0;

        for( i = 0; i < qtNum; i++) {
            System.out.println("Numero: ");
            num = scan.nextInt();
            if ((num % 2) == 0) {
                contPar++;
            } else
                contImpar++;
        }
        System.out.println("Quantidade de Pares: "+contPar);
        System.out.println("Quantidade de Impares: "+contImpar);


    }
}
