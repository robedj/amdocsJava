package desafioAlgoritmo;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DesafioColchao {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        while(leitor.hasNext()){
            int A = leitor.nextInt();
            int B = leitor.nextInt();
            int C = leitor.nextInt();
            int H = leitor.nextInt();
            int L = leitor.nextInt();

           if((A > H && B > L )||( B > H && A > L) || (B > H && C > L) || (A > H && C > L)){
                System.out.println("N");
            }else{
                System.out.println("S");
            }
        }

    leitor.close();
    }

}