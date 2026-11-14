import java.util.Scanner;

public class Leitura {
        static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        String filme;
        int anoDeLancamento=0;
        double avaliacao=0;

        System.out.println("Digite seu filme favorito");
        filme = entrada.nextLine();
        System.out.println("Qual o ano de lançamento?");
        anoDeLancamento = entrada.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        avaliacao = entrada.nextDouble();

        System.out.println("Filme: " +filme);
        System.out.println("Ano de Lançamento: " +anoDeLancamento);
        System.out.println("Avaliação: " +avaliacao);
    }
}
