package br.com.alura.exercises;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                somaPares += i;
            }
        }
        System.out.printf("A soma dos números pares de 1 a 100 é: %d", somaPares);
    }
}
