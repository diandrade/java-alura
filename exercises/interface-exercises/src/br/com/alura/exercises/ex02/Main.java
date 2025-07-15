/*Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea()
e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
A classe deve receber altura e largura como parâmetros.*/

package br.com.alura.exercises.ex02;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(10.0, 50.0);
        System.out.println(calculadora.calcularArea());
        System.out.println(calculadora.calcularPerimetro());
    }
}
