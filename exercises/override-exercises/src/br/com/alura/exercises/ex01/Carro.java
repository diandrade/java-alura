package br.com.alura.exercises.ex01;

import br.com.alura.exercises.ex02.Main;

public class Carro {
    private final double precoPrimeiroAno;
    private final double precoSegundoAno;
    private final double precoTerceiroAno;

    public Carro(String nomeModelo, double precoPrimeiroAno, double precoSegundoAno, double precoTerceiroAno){
        this.precoPrimeiroAno = precoPrimeiroAno;
        this.precoSegundoAno = precoSegundoAno;
        this.precoTerceiroAno = precoTerceiroAno;
    }

    public double maiorPreco(){
        return Math.max(precoPrimeiroAno, Math.max(precoSegundoAno, precoTerceiroAno));
    }

    public double menorPreco(){
        return Math.min(precoPrimeiroAno, Math.min(precoSegundoAno, precoTerceiroAno));
    }
}
