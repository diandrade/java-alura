package br.com.alura.exercises;

public class Soma {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int somaValores = 0;

        for (int i = 0; i < valores.length; i++) {
            somaValores += valores[i];
        }

        System.out.printf("A soma total das receitas é %d", somaValores);
    }
}
