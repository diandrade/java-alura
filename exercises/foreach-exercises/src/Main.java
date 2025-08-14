import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        for (String string : strings) {
            System.out.println(string);
        }

        Dog dog = new Dog();
        if (dog instanceof Dog){
            Animal animal = (Animal) dog;
        }

        Product c1 = new Product("Cheetos", 6.00);
        c1.addProduct("Cracks", 3.00);
        c1.addProduct("Pepsi", 3.50);

        c1.calculateAverageOfProducts();

        ArrayList<Form> forms = new ArrayList<>();

        Circle circle = new Circle(3.5);
        Square square = new Square(40.5);

        forms.add(circle);
        forms.add(square);

        for (Form form : forms){
            System.out.println(form.calculateArea());
        }

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount firstBankAccount = new BankAccount(1500.5, 376297);
        BankAccount secondBankAccount = new BankAccount(20000.75, 376267);
        BankAccount thirdBankAccount = new BankAccount(3780.75, 676267);

        bankAccounts.add(firstBankAccount);
        bankAccounts.add(secondBankAccount);
        bankAccounts.add(thirdBankAccount);

        BankAccount highestAccountBalance = new BankAccount(0, 0);
        for (BankAccount bankAccount : bankAccounts){
            if (bankAccount.getBalance() > highestAccountBalance.getBalance()){
                highestAccountBalance = bankAccount;
            }
        }
        System.out.println(highestAccountBalance);
    }
}