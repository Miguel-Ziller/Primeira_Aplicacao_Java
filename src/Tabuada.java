
import java.util.Scanner;

public class Tabuada {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int resultado = 0;

        System.out.println("Digite um número para ver sua tabuada: ");
        numero = entrada.nextInt();

        for (int i = 0; i <= 9; i++) {

            resultado = numero * (i + 1);

            System.out.println(numero + " x " + (i + 1) + " = " + resultado);
        }
    }
}
