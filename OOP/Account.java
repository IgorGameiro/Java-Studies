package OOP;

import java.util.ArrayList;
import java.util.List;

abstract class BaseAccount {
    protected String owner;
    protected double balance;

    public BaseAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public abstract String getAccountType();
}

class CheckingAccount extends BaseAccount {
    private static final double FEE = 2.50;

    public CheckingAccount(String owner, double initialBalance) {
        super(owner, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount + FEE <= balance) {
            balance -= (amount + FEE);
        }
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}

class SavingsAccount extends BaseAccount {
    public SavingsAccount(String owner, double initialBalance) {
        super(owner, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

class Bank {
    private List<BaseAccount> accounts = new ArrayList<>();

    public void addAccount(BaseAccount account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (BaseAccount acc : accounts) {
            System.out.println(acc.getOwner() + " - " + acc.getAccountType() + ": $" + acc.getBalance());
        }
    }
}

public class Account {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BaseAccount acc1 = new CheckingAccount("Alice", 500);
        BaseAccount acc2 = new SavingsAccount("Bob", 1000);

        acc1.deposit(200);
        acc1.withdraw(100);

        acc2.withdraw(150);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        bank.showAccounts();
    }
}
