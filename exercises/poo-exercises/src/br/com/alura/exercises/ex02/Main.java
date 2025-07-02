package br.com.alura.exercises.ex02;

/*Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar
e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Diego");
        pessoa1.setIdade(23);
        pessoa1.verificarIdade();
    }
}