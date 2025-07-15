public class Usuario implements OrquestradorAudio {
    //Atributes
    private String nome;
    private boolean chamado = false;

    //Constructor
    public Usuario(String nome) {
        this.nome = nome;
    }

    //Getter
    public String getNome() {
        return nome;
    }

    //Methods
    @Override
    public void curtir(Audio audio) {
        if (!chamado) {
            audio.setCurtidas(audio.getCurtidas() + 1);
            chamado = true;
            return;
        }
        audio.setCurtidas(audio.getCurtidas() - 1);
        chamado = false;
    }

    @Override
    public void reproduzir(Audio audio) {
        audio.setTotalDeReproducoes(audio.getTotalDeReproducoes() + 1);
    }
}
