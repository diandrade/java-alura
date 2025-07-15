package br.com.alura.exercises.ex02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private final double altura;
    private final double largura;

    CalculadoraSalaRetangular(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return altura * largura;
    }

    public double calcularPerimetro(){
        return 2 * (altura + largura);
    }
}
