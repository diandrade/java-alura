package br.com.alura.exercises.ex02;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando o sofá.");
    }
}
