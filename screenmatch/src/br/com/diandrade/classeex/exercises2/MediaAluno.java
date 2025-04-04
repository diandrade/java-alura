package br.com.diandrade.classeex.exercises2;

/*Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.*/

public class MediaAluno {
    private String nome;
    private double notas;
    private int qtdNotas;
    private int somaDasNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getQtdNotas() {
        return qtdNotas;
    }

    /*public double calcularMedia(double nota) {

    }*/

}
