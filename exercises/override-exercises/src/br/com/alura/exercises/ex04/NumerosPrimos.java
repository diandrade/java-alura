package br.com.alura.exercises.ex04;

import java.util.ArrayList;

public class NumerosPrimos {
    private final ArrayList<Integer> primos = new ArrayList<>();

    public void adicionarNumeroPrimo(int num){
        int multiplicador;

        multiplicador = 0;
        while (multiplicador <= num){
            if (multiplicador * multiplicador == num){
                System.out.println("O número inserido não é primo, portanto, não será adicionado.");
                return;
            }
            multiplicador++;
        }
        primos.add(num);
    }

    public void listarPrimos(){
        int index;

        index = 0;
        while (index < primos.toArray().length){
            System.out.println("O número primo armazenado na posição " + index + " é " + primos.get(index));
            index++;
        }
    }
}
