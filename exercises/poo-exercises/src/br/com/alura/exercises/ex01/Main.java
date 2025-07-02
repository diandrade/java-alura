package br.com.alura.exercises.ex01;

/*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.*/

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta(132456987);
        conta1.setSaldo(1050.35);
        conta1.titular = "Maria Alves";

        System.out.println("A titular " + conta1.getTitular() + " da conta " + conta1.getNumeroConta() +
                " possui R$" + conta1.getSaldo() + ".");
    }
}