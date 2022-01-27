package desafioAlgoritmo;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class ImparIntervalo {


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int menor = sc.nextInt();

            int maior = sc.nextInt();

            int aux = 0;
            if(menor > maior){
                aux = menor;
                menor = maior;
                maior = aux;
            }

            int soma = 0;
            for(aux = menor + 1; aux < maior; aux++){
                if((aux % 2) != 0 ){
                    soma = soma + aux;
                }
            }
        System.out.println(soma);
        }
    }

