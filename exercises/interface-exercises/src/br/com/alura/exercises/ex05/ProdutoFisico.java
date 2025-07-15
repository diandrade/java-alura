package br.com.alura.exercises.ex05;

public class ProdutoFisico implements Calculavel {
    private final double valorProduto;
    private final double desconto;

    ProdutoFisico(double valorProduto, double desconto){
        this.valorProduto = valorProduto;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return valorProduto - desconto;
    }
}
