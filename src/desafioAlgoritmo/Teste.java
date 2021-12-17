package desafioAlgoritmo;

import java.io.IOException;
import java.util.Scanner;

public class Teste{

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus;
           graus = Double.parseDouble(leitor.nextLine());

            //graus = leitor.nextDouble();

            if (graus <= 360.) {
                if (graus < 90. || graus == 360.){
                    System.out.println("Bom Dia!!");
                }else if ((graus >= 90.) && (graus < 180.)){
                    System.out.println("Boa Tarde!!");
                }
                else if ((graus >= 180.) && (graus < 270.)){
                    System.out.println("Boa Noite!!");
                }
                else System.out.println("De Madrugada!!");



                Double horas;
                if (graus >= 270.) {
                    horas =  (graus+ 90.)/15.;
                    if(horas >= 24.)
                        horas = horas % 24.;
                } else {                                   //Complete o código nos espaços em branco
                    horas =  (graus+90.)/15.;
                }

                Double minutos =(horas * 60) % 60 ;
                System.out.println(minutos);
                Double segundos = (minutos * 60) % 60;

               if (segundos > 59.) {
                    segundos = 0.0;
                    minutos += 1.0;
               }

                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
            }

        }
        leitor.close();
    }

}