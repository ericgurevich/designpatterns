package AdapterPattern;

public class OtherBankAccount {
    private int id;
    private Double balance;

    public OtherBankAccount(int id, Double initialBalance) {
        this.id = id;
        balance = initialBalance;
    }

    public double withdraw(boolean ableToWithdraw, double amount) {
        if (!ableToWithdraw) {
            throw new IllegalArgumentException("Not able to withdraw.");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Cannot withdraw more than balance.");
        }

        balance -= amount;
        return amount;
    }

    public void deposit(boolean ableToDeposit, double amount) {
        if (!ableToDeposit) {
            throw new IllegalArgumentException("Not able to deposit.");
        }

        balance += amount;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
