package br.com.alura.exercises.ex05;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setAutor("Marx");
        livro1.setTitulo("O Capital");
        livro1.exibirDetalhes();
    }
}