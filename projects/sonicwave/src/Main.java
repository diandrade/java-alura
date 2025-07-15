public class Main {
    public static void main(String[] args) {
        Musicas fool = new Musicas("Fool", 2.50, 16);
        Usuario user1 = new Usuario("Lucas");
        Usuario user2 = new Usuario("Rafaela");
        user1.curtir(fool);
        user1.reproduzir(fool);
        user1.reproduzir(fool);
        user1.reproduzir(fool);
        user2.curtir(fool);
        System.out.println(fool.getCurtidas());
        System.out.println(fool.getTotalDeReproducoes());
        user2.reproduzir(fool);
        user2.reproduzir(fool);
        user2.reproduzir(fool);
        System.out.println(fool.getTotalDeReproducoes());
    }
}
