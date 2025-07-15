package br.com.alura.exercises.ex04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private final double temperatura;

    ConversorTemperaturaPadrao (double temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return temperatura * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (temperatura - 32) / 1.8;
    }
}
