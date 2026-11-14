import java.util.Scanner;

public class Casting{
    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        double numeroDouble = 0;

            System.out.println("Digite um numero com decimais: ");
            numeroDouble = entrada.nextDouble();

            int numeroInteiro = (int) numeroDouble;
            System.out.println("Casting de double para int: " + numeroInteiro);
    }
}
