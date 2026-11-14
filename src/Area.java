import java.util.Scanner;

public class Area {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //Variáveis
        int opcao=0;
        double area=0, b=0, l=0, alt=0;
        String forma = "";

        System.out.println("-------------------");
        System.out.println("       Opcões      ");
        System.out.println("Quadrado: 1");
        System.out.println("Triângulo: 2");
        System.out.println("-------------------");

        System.out.println("Digite qual opção de área você deseja calcular: ");
        opcao = entrada.nextInt();

        if (opcao != 1 && opcao != 2){

            while (opcao != 1 && opcao != 2) {


                System.out.println("Opção Invalida!");
                System.out.println("Digite qual opção de área você deseja calcular:  1/2");
                opcao = entrada.nextInt();
            }
        }
        switch (opcao) {

            case 1:
                System.out.println("Opção Escolhida: Quadrado");
                System.out.println("Digite o valor do lado do Quadrado: ");
                l = entrada.nextDouble();
                area = l * l;
                forma = "Quadrado";
                break;
            case 2:
                System.out.println("Opção Escolhida: Triângulo");
                System.out.println("Digite o valor da altura do triângulo: ");
                alt = entrada.nextDouble();
                System.out.println("Digite o valor da base do triângulo: ");
                b = entrada.nextDouble();
                area = (b * alt)/2;
                forma = "Triângulo";
                break;
        }

        System.out.println("Forma Escolhida: " +forma);
        System.out.println("Área: " +area);
    }
}
