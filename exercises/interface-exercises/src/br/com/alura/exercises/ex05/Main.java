package br.com.alura.exercises.ex05;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1000, 200.0, 10.5);
        System.out.println(livro.calcularPrecoFinal());
    }
}
