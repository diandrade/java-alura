package br.com.alura.exercises.ex01;

public class ModeloCarro extends Carro{

    private final double percentualAcrescimo;

    public ModeloCarro(String nomeModelo, double precoPrimeiroAno, double precoSegundoAno, double precoTerceiroAno,
                       double percentualAcrescimo) {
        super(nomeModelo, precoPrimeiroAno, precoSegundoAno, precoTerceiroAno);
        this.percentualAcrescimo = percentualAcrescimo;
    }

    @Override
    public double maiorPreco() {
        return super.maiorPreco() * ((percentualAcrescimo / 100) + 1);
    }

    @Override
    public double menorPreco() {
        return super.menorPreco() * ((percentualAcrescimo / 100) + 1);
    }
}
