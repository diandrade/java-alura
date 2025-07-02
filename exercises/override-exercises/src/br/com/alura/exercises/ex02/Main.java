package br.com.alura.exercises.ex02;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.emitirSom();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}