package br.com.alura.collections.ex01;

public class Main {
    String[] employees = new String[0];

    public void addEmployee(String employee){
        int i;
        String[] temp;

        i = 0;
        temp = new String[employees.length + 1];
        while (i < employees.length){
            temp[i] = employees[i];
            i++;
        }
        temp[i] = employee;
        employees = temp;
    }

    public void readEmployees(){
        int i;
        int length;

        System.out.print("[");
        i = 0;
        length = this.employees.length;
        while (i < length){
            System.out.print(this.employees[i]);
            if (i == length - 1){
                System.out.print("]");
                break;
            }
            System.out.print(", ");
            i++;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.addEmployee("João");
        main.addEmployee("Maria");
        main.addEmployee("Vitor");
        main.addEmployee("Ana");

        System.out.print("Lista de Funcionários: ");
        main.readEmployees();
    }
}
