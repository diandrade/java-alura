package br.com.diandrade.classeex.exercises2;

/*Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar
e modificar esses atributos.
Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

public class IdadePessoa {
    private String nome;
    private int idade;

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

    public void verificarIdade(int idade){
        if (idade < 18){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");
        }
    }
}
