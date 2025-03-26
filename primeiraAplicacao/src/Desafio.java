import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        dadosCliente();
        painel();
    }
    public static void dadosCliente(){
        //Dados do Cliente:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Insira seu tipo de conta: ");
        String tipoDeConta = scanner.next();

        System.out.println("Insira seu saldo inicial: ");
        int saldoInicial = scanner.nextInt();
    }
    public static void painel(){
    }
}
