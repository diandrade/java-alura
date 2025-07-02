package br.com.alura.exercises.ex04;

/*Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.*/

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 3);
        aluno1.setNome("Alan");
        System.out.println(aluno1.getNome());

        aluno1.setNota(10);
        aluno1.setNota(10);
        aluno1.setNota(9.5);
        aluno1.calcularMedia();
    }
}