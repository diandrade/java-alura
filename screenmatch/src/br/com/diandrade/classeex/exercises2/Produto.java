package br.com.diandrade.classeex.exercises2;

/*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto){
        desconto = 1 - desconto / 100;
        preco *= desconto;
        System.out.println("O produto de " + nome + " com desconto ficou: " + preco);
    }
}
