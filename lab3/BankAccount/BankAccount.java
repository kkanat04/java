package lab3.BankAccount;

public class BankAccount {
    double balance;

    public BankAccount(double start) {
        if (start < 0) {
            balance = 0;
        } else {
            balance = start;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }
}
