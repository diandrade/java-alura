package br.com.alura.exercises.ex04;

public class Aluno {
    private String nome;
    private final double[] notas;
    private int quantidadeNotas = 0;
    private double somaDasNotas = 0;

    //Construtor
    public Aluno(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public double getNota(int index){
        if (index < 0){
            System.out.println("Insira um index válido.");
        }
        return notas[index];
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNota(double nota){
        notas[quantidadeNotas] = nota;
        somaDasNotas += nota;
        quantidadeNotas++;
    }

    public void calcularMedia() {
        System.out.println("A média das notas é: " + somaDasNotas / quantidadeNotas);
    }
}
