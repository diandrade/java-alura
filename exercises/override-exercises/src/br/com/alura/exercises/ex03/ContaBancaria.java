package br.com.alura.exercises.ex03;

public class ContaBancaria {
    private double saldo = 0;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo indisponível");
            return;
        }
        this.saldo -= valor;
    }

    public double consultarSaldo(){
        return saldo;
    }
}
