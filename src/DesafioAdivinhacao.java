import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
    public static void main(String[] args) {
        int tentativas = 1;
        int numeroAleatorio = new Random().nextInt(100);
        Integer numeroDigitadoPeloUsuario;

        while (tentativas <= 5) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um número de 0 a 100");
            numeroDigitadoPeloUsuario = Integer.parseInt(leitura.nextLine()) ;


            if (numeroDigitadoPeloUsuario > 100 || numeroDigitadoPeloUsuario < 0) {
                System.out.println("O número deve ser de 0 a 100!");

            } else {
                if (numeroDigitadoPeloUsuario < numeroAleatorio) {
                    System.out.println(("O número digitado é menor"));

                } else if (numeroDigitadoPeloUsuario > numeroAleatorio) {
                    System.out.println("O número digitado é maior");
                } else {
                    System.out.println("Você acertou!");
                    break;
                }
                if (tentativas == 5) {
                    System.out.println("Você não conseguiu acertar :( " + numeroAleatorio);
                }

                tentativas++;
            }

        }

    }
}

