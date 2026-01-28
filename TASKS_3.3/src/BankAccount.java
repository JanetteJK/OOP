import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private static ArrayList<Integer> accounts = new ArrayList<>();
    public static int getTotalAccounts() {
        if (!accounts.isEmpty()) {
            return accounts.size();
        } else {
            return 0;
        }
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        accounts.add(accountNumber);

    }

    public void deposit(int money) {
        System.out.println("Deposited " + money + " €");
        balance += money;
    }

    public void withdraw(int money) {
        if (balance > money) {
            System.out.println("Withdrew " + money + " €");
            balance -= money;
        } else {
            System.out.println("Not enough money to withdraw " + money + " €" );
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}