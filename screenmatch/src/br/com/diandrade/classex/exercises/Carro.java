package br.com.diandrade.classex.exercises;

import java.time.LocalDate;

public class Carro {
    public String modelo = "Fiat Punto";
    public int ano = 2015;
    public String cor = "Verde";

    public void fichaTecnica() {
        System.out.println("O modelo do veículo é: " + modelo);
        System.out.println("O ano do veículo é: " + ano);
        System.out.println("A cor do veículo é: " + cor);
    }

    public int calcularIdadeCarro() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }
}
