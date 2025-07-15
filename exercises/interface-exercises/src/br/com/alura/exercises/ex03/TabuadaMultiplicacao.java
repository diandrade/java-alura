package br.com.alura.exercises.ex03;

public class TabuadaMultiplicacao implements Tabuada{
    private final int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
