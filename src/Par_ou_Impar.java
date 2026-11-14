
import java.util.Scanner;

public class Par_ou_Impar {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        // Variáveis
        int numero = 0;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {

            System.out.println("O número " + numero + " é par!");

        } else {

            System.out.println("O número " + numero + " é ímpar!");
        }
    }
}
