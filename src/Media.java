import java.util.Scanner;

public class Media {

    static void main() {


        Scanner entrada = new Scanner(System.in);

        //Variáveis
        double n1=0, n2=0, media=0;

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("Média Final: " +media);
    }
}



