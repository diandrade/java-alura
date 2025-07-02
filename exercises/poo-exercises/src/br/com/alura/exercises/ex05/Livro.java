package br.com.alura.exercises.ex05;

public class Livro {
    private String titulo;
    private String autor;

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Métodos
    public void exibirDetalhes() {
        System.out.println(autor);
        System.out.println(titulo);
    }
}
