import java.util.Scanner;

public class Comparacao {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        int num1=0, num2=0;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 == num2) {

            System.out.println("Os dois números são iguais!");
        }else if (num1 > num2) {

            System.out.println("O número " +num1+ " é maior que o número " +num2+ "!");
        }else {

            System.out.println("O número " +num2+ " é maior que o número " +num1+ "!");
        }
    }
}
