package br.com.alura.exercises.ex05;

public class Livro extends ProdutoFisico{
    private final double taxaAdicional;

    Livro(double valorProduto, double desconto, double taxaAdicional) {
        super(valorProduto, desconto);
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() * (taxaAdicional / 100 + 1);
    }
}
