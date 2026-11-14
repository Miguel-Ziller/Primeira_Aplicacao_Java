import java.util.Scanner;

public class Subtração {

    static void main() {

        Scanner entrada = new Scanner(System.in);


        //Variáveis
        double n1=0, n2=0, r=0;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        r = n1 - n2;

        System.out.println("Resultado: " +r);
    }
}


