package br.com.alura.collections.ex02;

public class Main {
    String[] employees = new String[0];

    public static void main(String[] args) {
        Main main = new Main();

        main.addEmployee("João");
        main.addEmployee("Maria");
        main.addEmployee("Vitor");
        main.addEmployee("Ana");

        main.readEmployees();
        main.removeEmployee(2);
        System.out.println();
        main.readEmployees();
    }

    public void addEmployee(String name){
        int i;
        String[] temp = new String[employees.length + 1];

        i = 0;
        while (i < employees.length){
            temp[i] = employees[i];
            i++;
        }
        temp[i] = name;
        this.employees = temp;
    }

    public void removeEmployee(int index){
        String[] temp = new String[employees.length - 1];
        int i;

        i = 0;
        while (i < index){
            temp[i] = employees[i];
            i++;
        }
        while (i < employees.length){
            i++;
            temp[i] = employees[i];
        }
        employees = temp;
    }

    public void readEmployees(){
        int i;

        i = 0;
        while (i < this.employees.length){
            System.out.println(this.employees[i]);
            i++;
        }
    }
}
