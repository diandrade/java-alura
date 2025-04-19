package br.com.diandrade.classeex.exercises2;

/*Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.*/

public class MediaAluno {
    private String nome;
    private double somaDasNotas;
    private int quantidadeNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(Double nota) {
        this.somaDasNotas += nota;
        this.quantidadeNotas++;
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) {
            return 0.0;
        }
        return somaDasNotas / quantidadeNotas;
    }
}
