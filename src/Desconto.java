import java.util.Scanner;

public class Desconto {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        double precoOriginal=0, desc=0, precoFinal=0;
        String nome;

        System.out.println("Digite o nome do produto: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor do produto: ");
        precoOriginal = entrada.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        desc = entrada.nextDouble();

        precoFinal = precoOriginal - (precoOriginal * desc)/100;

        System.out.println("Produto: " +nome);
        System.out.println("Preço original: R$" +precoOriginal);
        System.out.println("Desconto : " +desc+ "%");
        System.out.println("Preço Final: R$" +precoFinal);



    }
}
