package br.com.alura.exercises;

import java.util.Scanner;

public class Degraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1;i <= degraus; i++){
            System.out.printf("Subindo o degrau %d", i);
            System.out.println();
        }
        System.out.println("Você chegou ao topo!");
    }
}
