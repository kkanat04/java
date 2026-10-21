package lab3.BankAccount;

public class BankDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        account.deposit(50);

        boolean result1 = account.withdraw(30);
        boolean result2 = account.withdraw(1000);

        System.out.println("after deposit: " + 150.0);
        System.out.println("withdraw 30: " + result1);
        System.out.println("withdraw 1000: " + result2);
        System.out.println("balance: " + account.getBalance());
    }
}
