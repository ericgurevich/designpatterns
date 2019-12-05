package StrategyPattern;

import StrategyPattern.WithdrawStrategies.DefaultStrategy;
import StrategyPattern.WithdrawStrategies.Sub1000Strategy;
import StrategyPattern.WithdrawStrategies.Sub500Strategy;

public class BankAccount {
    private int id;
    private Double balance;

    public BankAccount(int id, Double initialBalance) {
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
}
