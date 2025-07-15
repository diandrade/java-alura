package br.com.alura.exercises.ex01;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda(6.00);
        System.out.println(conversor.converterDolarParaReal());
    }
}