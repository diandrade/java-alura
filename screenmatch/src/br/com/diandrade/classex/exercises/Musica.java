package br.com.diandrade.classex.exercises;

public class Musica {
    public String titulo = "Roma";
    public String artista = "Fibonacci";
    public int anoLancamento = 2016;
    public Double avaliacao = 0.0;
    public int numAvaliacoes = 0;

    public void fichaTecnica() {
        System.out.println("Ficha técnica: ");
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }
}
