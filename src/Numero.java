import java.util.Scanner;

public class Numero {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        int num=0;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if (num > 0) {

            System.out.println("O número " +num+ " é positivo!");
        }else {

            System.out.println("O número " +num+ " é negativo!");
        }
    }
}
