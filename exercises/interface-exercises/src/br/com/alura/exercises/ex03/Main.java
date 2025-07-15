/*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a
tabuada de um número. A classe deve receber o número como parâmetro.*/

package br.com.alura.exercises.ex03;

public class Main {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao(2);
        tabuadaMultiplicacao.mostrarTabuada();
    }
}
