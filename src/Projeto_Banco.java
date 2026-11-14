
import java.util.Scanner;

public class Projeto_Banco {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        // Variáveis
        String nome, tipoConta = "";
        int opcaoCont = 0, tentarNovamente = 1;
        int opcao = 0;
        double saldo = 2500, valorRec = 0, valorTran = 0;

        // Tela inicial
        System.out.println("------------------------------");
        System.out.println("        BANCO BRADESCO        ");
        System.out.println("------------------------------");

        System.out.println("Digite seu nome completo: ");
        nome = entrada.nextLine();

        System.out.println("Bem-vindo, " + nome + "!");

        // Escolha do tipo de conta
        System.out.println("Qual tipo de conta você deseja acessar?");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        opcaoCont = entrada.nextInt();

        while (opcaoCont != 1 && opcaoCont != 2) {

            System.out.println("Opção inválida! Tente novamente:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            opcaoCont = entrada.nextInt();
        }

        switch (opcaoCont) {

            case 1:
                tipoConta = "Corrente";
                break;
            case 2:
                tipoConta = "Poupança";
                break;
        }

        // Dados do cliente
        System.out.println("------------------------------");
        System.out.println("       DADOS DO CLIENTE       ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("------------------------------");

        // Menu de operações
        while (opcao != 4) {

            System.out.println("------------------------------");
            System.out.println("       MENU DE OPERAÇÕES      ");
            System.out.println("------------------------------");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");

            System.out.println("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            // Validação do menu
            while (opcao < 1 || opcao > 4) {

                System.out.println("Opção inválida!");

                System.out.println("------------------------------");
                System.out.println("       MENU DE OPERAÇÕES      ");
                System.out.println("------------------------------");
                System.out.println("1 - Consultar Saldo");
                System.out.println("2 - Receber Valor");
                System.out.println("3 - Transferir Valor");
                System.out.println("4 - Sair");

                System.out.println("Digite uma opção novamente: ");
                opcao = entrada.nextInt();
            }

            switch (opcao) {

                case 1:
                    System.out.println("Seu saldo atual é R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor que você deseja receber: ");
                    valorRec = entrada.nextDouble();

                    if (valorRec > 0) {

                        saldo = saldo + valorRec;

                        System.out.println("Valor recebido com sucesso!");
                        System.out.println("Saldo atualizado: R$ " + saldo);

                    } else {

                        System.out.println("Valor inválido!");
                    }

                    break;

                case 3:

                    tentarNovamente = 1;

                    while (tentarNovamente == 1) {

                        System.out.println("Informe o valor que você deseja transferir: ");
                        valorTran = entrada.nextDouble();

                        if (valorTran <= 0) {

                            System.out.println("Valor inválido!");

                        } else if (saldo < valorTran) {

                            System.out.println("SALDO INSUFICIENTE!");
                            System.out.println("Não foi possível realizar a transferência!");

                            System.out.println("Deseja tentar novamente?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - Não");
                            tentarNovamente = entrada.nextInt();

                            while (tentarNovamente != 1 && tentarNovamente != 2) {

                                System.out.println("Opção inválida!");
                                System.out.println("1 - Sim");
                                System.out.println("2 - Não");

                                tentarNovamente = entrada.nextInt();
                            }

                        } else {

                            saldo = saldo - valorTran;

                            System.out.println("Transferência realizada com sucesso!");
                            System.out.println("Saldo atualizado: R$ " + saldo);

                            tentarNovamente = 0;
                        }
                    }
                    break;
                case 4:
                    System.out.println("------------------------------");
                    System.out.println("Obrigado por utilizar o Banco Bradesco!");
                    System.out.println("Até a próxima, " + nome + "!");
                    System.out.println("------------------------------");
                    break;
            }
        }
    }
}
