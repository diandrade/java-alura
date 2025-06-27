package br.com.alura.exercises.ex01;

public class ContaBancaria {
    //Atributos
    private int numeroConta;
    private double saldo;
    public String titular;

    //Getters e Setters
    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
