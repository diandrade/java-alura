package br.com.alura.exercises.ex04;

import java.util.ArrayList;

public class GerarProximoPrimo extends NumerosPrimos {
    public void gerarProximoPrimo(){
        int contador;
        int ultimoPrimo;
        ArrayList<Integer> primos;

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();

        primos = getPrimos();
        if (primos.isEmpty()) {
            adicionarNumeroPrimo(2);
            return;
        }

        contador = 1;
        ultimoPrimo = primos.get(primos.size() - 1);
        while (!verificadorPrimo.verificarSeEhPrimo(ultimoPrimo + contador)){
            contador++;
        }
       adicionarNumeroPrimo(ultimoPrimo + contador);
    }
}
