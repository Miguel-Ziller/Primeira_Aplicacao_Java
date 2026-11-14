
import java.util.Scanner;

public class Outro_Loop {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        String filme;
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        System.out.println("Digite o nome do filme: ");
        filme = entrada.nextLine();

        System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
        nota = entrada.nextDouble();

        while (nota != -1) {

            mediaAvaliacao = mediaAvaliacao + nota;
            totalDeNotas++;

            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = entrada.nextDouble();
        }

        if (totalDeNotas == 0) {

            System.out.println("Você encerrou a avaliação!");

        } else {

            mediaAvaliacao = mediaAvaliacao / totalDeNotas;

            System.out.println("Filme: " + filme);
            System.out.println("Média de avaliações: " + mediaAvaliacao);
        }

    }
}
