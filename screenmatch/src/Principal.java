import br.com.alura.screenmatch.modelos.Filme;
import br.com.diandrade.classeex.exercises2.IdadePessoa;
import br.com.diandrade.classeex.exercises2.MediaAluno;
import br.com.diandrade.classeex.exercises2.Produto;
import br.com.diandrade.classex.exercises.*;

public class Principal {
    public static void main(String[] args) {
        //instanciaFilme();
        //instanciaPessoa();
        //instanciaCalculadora();
        //instanciaMusica();
        //instanciaCarro();
        //instanciaAluno();
        //instanciaIdadePessoa();
        //instanciaProduto();
    }

    static void instanciaFilme() {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }

    static void instanciaPessoa() {
        Pessoa mensagem = new Pessoa();
        mensagem.olaMundo();
    }

    static void instanciaCalculadora() {
        Calculadora dobro = new Calculadora();
        System.out.println(dobro.dobro(2));
    }

    static void instanciaMusica() {
        Musica musica = new Musica();

        musica.fichaTecnica();
        musica.avaliaMusica(10);
        musica.avaliaMusica(8.5);
        musica.avaliaMusica(6.25);
        System.out.println("A média das avaliações é: " + musica.mediaAvaliacoes());
    }

    static void instanciaCarro() {
        Carro carro = new Carro();

        carro.fichaTecnica();
        System.out.println(carro.calcularIdadeCarro());
    }

    static void instanciaAluno() {
        Aluno aluno = new Aluno();
        aluno.exibirInformacoes();
    }

    static void instanciaIdadePessoa() {
        IdadePessoa idadepessoa = new IdadePessoa();
        idadepessoa.verificarIdade(18);
    }

    static void instanciaProduto() {
        Produto produto = new Produto();
        produto.setNome("Joel");
        produto.setPreco(10);
        produto.aplicarDesconto(10);
    }

    static void MediaAluno() {
        MediaAluno mediaAluno = new MediaAluno();
        mediaAluno.setNotas(10);
        mediaAluno.setNotas(9);
        mediaAluno.setNotas(8);
        mediaAluno.calcularMedia();
    }
}
