/*Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses,
VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo
e gerarProximoPrimo() para o GeradorPrimo.*/

package br.com.alura.exercises.ex04;

public class Main {
    public static void main(String[] args) {
        GerarProximoPrimo gerarProximoPrimo = new GerarProximoPrimo();
        gerarProximoPrimo.adicionarNumeroPrimo(4);
        gerarProximoPrimo.adicionarNumeroPrimo(3);
        gerarProximoPrimo.adicionarNumeroPrimo(2);
        gerarProximoPrimo.adicionarNumeroPrimo(5);
        gerarProximoPrimo.listarPrimos();
        System.out.println(gerarProximoPrimo.getPrimos());
        gerarProximoPrimo.gerarProximoPrimo();
        System.out.println(gerarProximoPrimo.getPrimos());
    }
}