package ObserverPattern;

import ObserverPattern.WithdrawStrategies.DefaultStrategy;
import ObserverPattern.WithdrawStrategies.Sub1000Strategy;
import ObserverPattern.WithdrawStrategies.Sub500Strategy;

public class CheckingAccount implements BankAccount {
    private int id;
    private Double balance;

    public CheckingAccount(int id, Double initialBalance) {
        this.id = id;
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public int getID() {
        return id;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Cannot withdraw more than balance.");
        }

        WithdrawStrategy withdrawStrategy;

        if (balance < 500) {
            withdrawStrategy = new Sub500Strategy();
        } else if (balance < 1000) {
            withdrawStrategy = new Sub1000Strategy();
        } else {
            withdrawStrategy = new DefaultStrategy();
        }

        double maxWithdraw = withdrawStrategy.calculateMaxWithdraw(balance);

        if (amount > maxWithdraw) {
            throw new IllegalArgumentException("Cannot withdraw more than $" + maxWithdraw);
        }

        balance -= amount;
        return amount;
    }

    @Override
    public void updateAccountType() {
        System.out.println("This is a checking account.");
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void update(Object interestAmount) {
        deposit((Double) interestAmount);
    }
}
