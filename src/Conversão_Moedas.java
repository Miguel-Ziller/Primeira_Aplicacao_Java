import java.util.Scanner;

public class Conversão_Moedas {

        static void main() {

            Scanner entrada = new Scanner(System.in);

            //Variáveis
            int opcao=0;
            double real=0, dolar=0, cotaçãoD=0 ;



            System.out.println("---------------------------------------");
            System.out.println("             Moeda Desejada            ");
            System.out.println("                 Opcões                ");
            System.out.println("Reais (R$): 1");
            System.out.println("Dolar (US$): 2");
            System.out.println("---------------------------------------");

            System.out.println("Qual a cotação atual do dólar? ");
            cotaçãoD = entrada.nextDouble();

            System.out.println("Digite qual opção vc deseja: ");
            opcao = entrada.nextInt();

            if (opcao != 1 && opcao != 2) {

                while (opcao != 1 && opcao != 2) {

                    System.out.println("Opção inválida!");
                    System.out.println("Tente Novamente: ");
                    opcao = entrada.nextInt();
                }
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite quantos dólares você deseja converter para real: ");
                    dolar = entrada.nextDouble();
                    real = dolar * cotaçãoD;
                    break;
                case 2:
                    System.out.println("Digite quantos reais você deseja converter para dólar: ");
                    real = entrada.nextDouble();
                    dolar = real/cotaçãoD;
                    break;
            }
            System.out.println("Reais: R$" + String.format("%.2f", real));
            System.out.println("Dólar: US$" + String.format("%.2f", dolar));
        }
    }







