import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        dadosCliente();
    }

    public static void dadosCliente() {
        Scanner scanner = new Scanner(System.in);

        // Validação do nome (aceita espaços)
        String nome;
        while (true) {
            System.out.println("Insira seu nome: ");
            nome = scanner.nextLine().trim();  // trim() remove espaços extras
            if (!nome.isEmpty()) {
                break;
            }
            System.out.println("Nome não pode ser vazio!");
        }

        // Validação do tipo de conta
        String tipoDeConta;
        while (true) {
            System.out.println("Insira seu tipo de conta: ");
            tipoDeConta = scanner.nextLine().trim();
            if (!tipoDeConta.isEmpty()) {
                break;
            }
            System.out.println("Tipo de conta não pode ser vazio!");
        }

        // Validação do saldo (número positivo)
        double saldoInicial;
        while (true) {
            System.out.println("Insira seu saldo inicial: ");
            try {
                saldoInicial = scanner.nextInt();
                if (saldoInicial > 0) {
                    break;
                }
                System.out.println("Saldo deve ser positivo!");
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido!");
                scanner.next();
            }
        }

        painel(nome, tipoDeConta, saldoInicial);
        scanner.close();
    }

    public static void painel(String nome, String tipoDeConta, double saldoInicial) {
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("\n*************************************");
            System.out.println("\nDados iniciais do cliente:");
            System.out.println("Nome:           " + nome);
            System.out.println("Tipo Conta:     " + tipoDeConta);
            System.out.println("Saldo Inicial:  R$" + saldoInicial);
            System.out.println("*************************************");
            System.out.println("\nOperações");
            System.out.println("\n1 - Consultar Saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.println("\nInsira a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Insira a quantidade de valor a ser recebida: ");
                    double valorRecebido = scanner.nextDouble();
                    saldoInicial += valorRecebido;
                    break;
                case 3:
                    System.out.println("Insira a quantidade de valor a ser transferida: ");
                    double valorTransferido = scanner.nextDouble();
                    if (valorTransferido > saldoInicial) {
                        System.out.println("Impossível realizar esta transferência.");
                    } else {
                        saldoInicial -= valorTransferido;
                    }
                    break;
                case 4:
                    loop = false;
                    System.out.println("Saindo....");
                    break;
                default:
                    loop = false;
                    System.out.println("Insira uma opção válida.");
            }
        }
    }
}
