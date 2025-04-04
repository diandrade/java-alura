public class Principal {
    public static void main(String[] args) {
        instanciaFilme();
        //instanciaPessoa();
        //instanciaCalculadora();
        //instanciaMusica();
        //instanciaCarro();
        //instanciaAluno();
    }

    static void instanciaFilme() {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

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
}
