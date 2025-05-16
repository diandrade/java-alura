import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mediaNotas();
        castingDouble();
        concatenarLetraEPalavra();
        valorProduto();
        conversaoDolarReal();
        descontoEmReais();
    }

    //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
    public static void mediaNotas() {
        double nota1 = 15.2;
        double nota2 = 43.7;
        double media = (nota1 + nota2) / 2;
        String mediaFormatada = String.format("%.2f", media);
        System.out.println("A média das notas designadas é: " + mediaFormatada);
    }

    /*Declare uma variável do tipo double e uma variável do tipo int.
    Faça o casting da variável double para int e imprima o resultado.*/
    public static void castingDouble() {
        double nota1 = 10.5;
        int casting = (int) nota1;
        int nota2 = 10;
        int soma = casting + nota2;
        System.out.println(soma);
    }

    /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
    Atribua valores a essas variáveis e concatene-as em uma mensagem.*/
    public static void concatenarLetraEPalavra() {
        char letra = 'A';
        String palvra = "bracadabra";
        System.out.println(letra + palvra);
    }

    /*Declare uma variável do tipo double precoProduto
    e uma variável do tipo int (quantidade).
    Calcule o valor total multiplicando o preço do produto
    pela quantidade e apresente o resultado em uma mensagem.*/
    public static void valorProduto() {
        double precoProduto = 10.5;
        int quantidade = 3;
        double valorProduto = precoProduto + (double) quantidade;
        System.out.println("O valor do produto é: " + valorProduto);
    }

    /*Declare uma variável do tipo double valorEmDolares.
    Atribua um valor em dólares a essa variável.
    Considere que o valor de 1 dólar é equivalente a 4.94 reais.
    Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

    public static void conversaoDolarReal() {
        double cotacaoDolar = 4.94;
        double dolares = 20.00;
        double reais = cotacaoDolar * dolares;
        String reaisFormatado = String.format("%.2f", reais);
        System.out.println("O valor de U$" + dolares + " é R$" + reaisFormatado);
    }

    /*Declare uma variável do tipo double precoOriginal.
    Atribua um valor em reais a essa variável,
    representando o preço original de um produto.
    Em seguida, declare uma variável do tipo double percentualDesconto
    e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
    Calcule o valor do desconto em reais,
    aplique-o ao preço original e imprima o novo preço com desconto.*/

    public static void descontoEmReais() {
        double precoOriginal = 39.90;
        double percentualDesconto = 10;
        double valordoDesconto = precoOriginal * percentualDesconto / 100;
        double precoComDesconto = precoOriginal - valordoDesconto;
        System.out.println("O valor de R$" + precoOriginal + " com o desconto de "
                + percentualDesconto + "%, passa a ser: R$" + precoComDesconto);
    }
}
