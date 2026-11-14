import java.util.Scanner;

public class Produto {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        double precoProd=0, total=0;
        int quantidade=0;
        String nome;

        System.out.println("Digite o nome do produto: ");
        nome = entrada.nextLine();

        System.out.println("Digite o valor do produto: ");
        precoProd = entrada.nextDouble();

        System.out.println("Digite a quantidade: ");
        quantidade = entrada.nextInt();

        total = precoProd * quantidade;

        System.out.println("Produto: " +nome);
        System.out.println("Preco: " +precoProd);
        System.out.println("Quantidade: " +quantidade);
        System.out.println("Valor Total: " +total);
    }
}
