import java.io.IOException;
import java.util.Scanner;

public class ViraTempo {

        public static void main(String[] args) throws IOException {
                Scanner leitor = new Scanner(System.in);
                String mensagem;
                while (leitor.hasNext()) {
                        int graus = leitor.nextInt();
                        if ((graus == 360) || (graus < 90)) {
                                mensagem = "Bom Dia!!";
                        } else if ((graus >= 90) && (graus < 180)) {
                                mensagem = "Boa Tarde!!";
                        } else if ((graus >= 180) && (graus < 270)) {
                                mensagem = "Boa Noite!!";
                        }else{
                                mensagem = "De Madrugada!!";
                        }

                        System.out.println(mensagem);

                }
                leitor.close();
        }
}



