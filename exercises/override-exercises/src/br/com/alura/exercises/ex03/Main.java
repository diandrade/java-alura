package br.com.alura.exercises.ex03;

public class Main {
    public static void main(String[] args) {
        /*ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println(contaBancaria.consultarSaldo());
        contaBancaria.depositar(1000);
        System.out.println(contaBancaria.consultarSaldo());
        contaBancaria.sacar(500);
        System.out.println(contaBancaria.consultarSaldo());*/

        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.consultarSaldo());
        contaCorrente.depositar(1000);
        System.out.println(contaCorrente.consultarSaldo());
        contaCorrente.cobrarTarifaMensal(250);
        System.out.println(contaCorrente.consultarSaldo());
    }
}