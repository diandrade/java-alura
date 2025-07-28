public class Main {
    public static void main(String[] args) {
        Produto cliente1 = new Produto("Coca-Cola", 6.00, 4);
        ProdutoPerecivel cliente2 = new ProdutoPerecivel("Batata-Doce", 2.50, 6, 30);

        cliente1.adicionarProduto("Pepsi", 3.90, 3);
        cliente1.adicionarProduto("Bic", 6.00, 1);
        cliente1.exibirLista();

        cliente2.adicionarProduto("Frango-Argentino", 35, 2);
        cliente2.exibirLista();
    }
}
