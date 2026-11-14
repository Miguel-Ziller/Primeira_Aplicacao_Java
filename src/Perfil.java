import java.util.Scanner;

public class Perfil {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        //variáveis
        String nome, estado;

        System.out.println("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Olá " +nome);
        System.out.println("Tudo bem? ");
        estado = entrada.nextLine();
    }
}
