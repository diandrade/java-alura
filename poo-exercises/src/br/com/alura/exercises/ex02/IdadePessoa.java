package br.com.alura.exercises.ex02;

public class IdadePessoa {
    //Atributos
    private String nome;
    private int idade;

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos
    public void verificarIdade() {
        if (idade < 18){
            System.out.println("A pessoa " + nome + " é menor de Idade.");
        }
        else{
            System.out.println("A pessoa " + nome + " é maior de Idade.");
        }
    }
}
