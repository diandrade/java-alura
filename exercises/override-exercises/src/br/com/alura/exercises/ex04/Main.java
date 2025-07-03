/*Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses,
VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo
e gerarProximoPrimo() para o GeradorPrimo.*/

package br.com.alura.exercises.ex04;

public class Main {
    public static void main(String[] args) {
        /*NumerosPrimos numeroPrimos = new NumerosPrimos();
        numeroPrimos.adicionarNumeroPrimo(4);
        numeroPrimos.adicionarNumeroPrimo(3);
        numeroPrimos.adicionarNumeroPrimo(2);
        numeroPrimos.adicionarNumeroPrimo(5);
        numeroPrimos.listarPrimos();*/

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(3);
        verificadorPrimo.verificarSeEhPrimo(4);
    }
}