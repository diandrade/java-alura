package br.com.alura.exercises.ex01;

/*
Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
para definir o nome do modelo, os preços médios para cada ano,
e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas,
utilizando-a na classe principal para definir preços e mostrar informações.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Antes do acrescimo: ");
        Carro carro = new Carro("Fiat Punto", 40000.0,
                35000.0, 30000.0);
        System.out.println(carro.maiorPreco());
        System.out.println(carro.menorPreco());

        System.out.println("Após o acrescimo: ");
        ModeloCarro modeloCarro = new ModeloCarro("Fiat Punto", 40000.0,
                35000.0, 30000.0, 10);
        System.out.println(modeloCarro.maiorPreco());
        System.out.println(modeloCarro.menorPreco());
    }
}