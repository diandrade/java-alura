public class Audio {
    private final String titulo;
    private final double duracao;
    private final int classificacao;
    private int totalDeReproducoes = 0;
    private int curtidas = 0;

    public Audio(String titulo, double duracao, int classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}
