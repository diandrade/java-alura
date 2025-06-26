package br.com.alura.exercises.ex01;

public class ContaBancaria {
    //Atributos
    private int numeroConta;
    private int saldo;
    public String titular;

    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
