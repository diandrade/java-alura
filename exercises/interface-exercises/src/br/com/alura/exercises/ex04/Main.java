/*Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os
resultados.*/

package br.com.alura.exercises.ex04;

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao(25.5);
        System.out.println(conversor.celsiusParaFahrenheit());
        System.out.println(conversor.fahrenheitParaCelsius());
    }
}
