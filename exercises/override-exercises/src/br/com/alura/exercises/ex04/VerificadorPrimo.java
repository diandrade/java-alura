package br.com.alura.exercises.ex04;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int num){
        int multiplicador;

        multiplicador = 0;
        while (multiplicador <= num){
            if (multiplicador * multiplicador == num){
                System.out.println("O número inserido não é primo.");
                return;
            }
            multiplicador++;
        }
        System.out.println("O numero inserido é primo!");
    }
}
