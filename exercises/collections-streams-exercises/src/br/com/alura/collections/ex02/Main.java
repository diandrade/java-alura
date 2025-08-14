package br.com.alura.collections.ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Joana");
        employees.add("Lucas");
        employees.add("Pedro");
        employees.add("Antônio");
        employees.remove(2);
        System.out.println("Lista após a exclusão: " + employees);
    }
}
