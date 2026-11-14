import java.util.Scanner;

public class Loop {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        String filme;
        double avaliacao=0, media=0;

        System.out.println("Digite o nome do  filme: ");
        filme = entrada.nextLine();

        for (int i=0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme");
            avaliacao = entrada.nextDouble();

            media = media + avaliacao;
        }

        media = media/3;


        System.out.println("Filme: " +filme);
        System.out.println("Media da Avaliações: " +media);
    }
}
