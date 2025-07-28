import java.util.ArrayList;

public class Produto {
    private final String nome;
    private final double preco;
    private final int quantidade;
    private final ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        listaDeProdutos.add(this);
    }

    public int tamanhoDaLista(){
        return listaDeProdutos.size();
    }

    public void adicionarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        listaDeProdutos.add(produto);
    }

    public Produto recuperarProduto(int index){
        if (index < 0 || index >= tamanhoDaLista()){
            System.out.println("O produto na posição apresentada não existe. Portanto um nulo será retornado.");
            return null;
        }
        return listaDeProdutos.get(index);
    }

    public void exibirLista(){
        for (int i = 0; i < tamanhoDaLista(); i++) {
            System.out.println(listaDeProdutos.get(i));
        }
    }

    @Override
    public String toString() {
        return "[nome:" + nome + ", preço:" + preco + ", quantidade:" + quantidade + "]";
    }
}
