
import java.util.Scanner;

public class Dia_da_semana {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        int dia = 0;
        String nomeDia;

        // Tabela dos dias da semana
        System.out.println("===== DIAS DA SEMANA =====");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");

        // Repete enquanto o número for inválido
        while (dia < 1 || dia > 7) {

            System.out.println("Digite o número do dia da semana:");
            dia = entrada.nextInt();

            if (dia < 1 || dia > 7) {
                System.out.println("Dia inválido! Digite um número de 1 a 7.");
            }
        }

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
