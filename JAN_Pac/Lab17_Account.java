package JAN_Pac;

class Account {                                                          //17 question
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            if (balance >= minimumBalance) {
                return true;
            } else {
                System.out.println("Withdrawal not allowed due to minimum balance constraint.");
                balance += amount; // Revert the balance change
                return false;
            }
        }
        return false;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal not allowed due to overdraft limit.");
            return false;
        }
    }
}

public class Lab17_Account {
    public static void main(String[] args) {
        SavingsAccount savingsAcc = new SavingsAccount("S123", 900, 300);
        CurrentAccount currentAcc = new CurrentAccount("C456", 600, 400);

        savingsAcc.withdraw(300); // Withdrawal not allowed due to minimum balance constraint.
        currentAcc.withdraw(700); // Withdrawal not allowed due to overdraft limit.

        System.out.println("Savings Account Balance: " + savingsAcc.balance); // Should still be 1000
        System.out.println("Current Account Balance: " + currentAcc.balance); // Should still be 500
    }
}