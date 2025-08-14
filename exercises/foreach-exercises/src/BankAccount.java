public class BankAccount {
    private double balance;
    private int accountNumber;

    public double getBalance() {
        return balance;
    }

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return ("The Account " + accountNumber + " have the highest balance.");
    }
}
