package br.com.alura.exercises.ex03;

public class Produto {
    //Atributos
    private String nome;
    private double preco;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    public void aplicarDesconto(double valorPercentual){
        valorPercentual = 1 - valorPercentual / 100;
        preco *= valorPercentual;
    }
}
