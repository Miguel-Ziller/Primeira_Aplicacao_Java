import java.util.Locale;
import java.util.Scanner;

public class Palavras {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        char letra;
        String palavra;

        System.out.println("Digite a primeira letra de uma palavra: ");
        letra = entrada.next().toUpperCase().charAt(0);

        System.out.println("Digite o resto da palavra: ");
        palavra = entrada.next().toLowerCase();

        System.out.println("A palavra é: " +letra + palavra);
    }
}
