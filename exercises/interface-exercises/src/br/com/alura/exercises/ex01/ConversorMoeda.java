/*
Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
*/

package br.com.alura.exercises.ex01;

public class ConversorMoeda implements ConversaoFinanceira {
    private final double dolar;

    public ConversorMoeda(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        double real = 5.55;
        return dolar * real;
    }
}
