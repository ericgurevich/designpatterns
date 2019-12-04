package InitialBank;

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

    public double getID() {
        return id;
    }
}
