package br.com.alura.exercises.ex03;

/*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para
acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual
e reduz o preço do produto.*/

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Coca-Cola");
        produto1.setPreco(10.00);
        System.out.println("O preço do produto " + produto1.getNome() + " antes do desconto é de: " + produto1.getPreco());
        produto1.aplicarDesconto(10.00);
        System.out.println("O preço do produto " + produto1.getNome() + " depois do desconto é de: " + produto1.getPreco());
    }
}