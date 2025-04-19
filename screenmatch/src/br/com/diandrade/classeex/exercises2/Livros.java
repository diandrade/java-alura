/*Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar
e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.*/

package br.com.diandrade.classeex.exercises2;

public class Livros {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O título do livro é: " + titulo + " e o autor é: " + autor);
    }
}
