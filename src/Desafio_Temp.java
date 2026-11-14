import java.util.Scanner;

public class Desafio_Temp {

        static void main() {

            Scanner entrada = new Scanner(System.in);

            //Variáveis
            int temp = 0;
            double celsius = 0, fah = 0;

            System.out.println("---------------------------------------");
            System.out.println("          Temperatura desejada         ");
            System.out.println("                 Opcões                ");
            System.out.println("Celsius: 1");
            System.out.println("Fahrenheit: 2");
            System.out.println("---------------------------------------");

            System.out.println("Digite qual opção você deseja: ");
            temp = entrada.nextInt();

            while (temp != 1 && temp != 2) {

                System.out.println("Opção inválida!");
                System.out.println("Tente Novamente: ");
                temp = entrada.nextInt();
            }


            switch (temp) {
                case 1:
                    System.out.println("Digite quantos graus esta em Fahrenheit (°F): ");
                    fah = entrada.nextDouble();
                    celsius = (fah - 32) / 1.8;
                    break;
                case 2:
                    System.out.println("Digite quantos gruas esta em Celsius (C°): ");
                    celsius = entrada.nextDouble();
                    fah = (celsius * 1.8) + 32;
                    break;
            }
            System.out.println("Temperatura Celsius: " + String.format("%.2f", celsius));
            System.out.println("Temperatura Fahrenheit: " + String.format("%.2f", fah));
        }
    }



