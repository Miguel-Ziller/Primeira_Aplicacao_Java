
import java.util.Scanner;

public class Fatorial {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        // Variáveis
        int numero = 0;
        int fatorial = 1;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {

            fatorial = fatorial * (i + 1);
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
