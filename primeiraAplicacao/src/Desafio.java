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
        int saldoInicial;
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
                scanner.next();  // Limpa o input inválido
            }
        }

        painel(nome, tipoDeConta, saldoInicial);
        scanner.close();
    }

    private static void painel(String nome, String tipoDeConta, int saldoInicial) {
        System.out.println("*************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome:           " + nome);
        System.out.println("Tipo Conta:     " + tipoDeConta);
        System.out.println("Saldo Inicial:  R$" + saldoInicial);
        System.out.println("*************************************");
        System.out.println();
        System.out.println();
        System.out.println("Operações");
        System.out.println();
        System.out.println("1 - Consultar Saldos");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");
    }

}
