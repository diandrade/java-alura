public class Musica {
    String titulo = "Roma";
    String artista = "Fibonacci";
    int anoLancamento = 2016;
    Double avaliacao = 0.0;
    int numAvaliacoes = 0;

    void fichaTecnica(){
        System.out.println("Ficha técnica: ");
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes ++;
    }

    double mediaAvaliacoes (){
        return avaliacao / numAvaliacoes;
    }
}
