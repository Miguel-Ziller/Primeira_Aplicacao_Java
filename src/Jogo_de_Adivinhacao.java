
import java.util.Random;
import java.util.Scanner;

public class Jogo_de_Adivinhacao {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        // Variáveis
        int numGerado = new Random().nextInt(100);
        int numDigitado = 0;
        int tentativas = 0;

        while (numDigitado != numGerado) {

            System.out.println("Digite seu palpite: ");
            numDigitado = entrada.nextInt();

            tentativas++;

            if (numDigitado > numGerado) {

                System.out.println("Digite um número menor!");

            } else if (numDigitado < numGerado) {

                System.out.println("Digite um número maior!");

            } else {

                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativas);
            }
        }

    }
}
