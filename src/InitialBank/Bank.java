package InitialBank;

import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<Integer, BankAccount> bankAccounts;
    private int uniqueAccountID;

    public Bank(String bankName) {
        this.bankName = bankName;
        uniqueAccountID = 0;
        bankAccounts = new HashMap<>();
    }

    public BankAccount addAccount(Double initialBalance) {
        int newID = generateAccountID();
        BankAccount newAccount = new BankAccount(newID, initialBalance);
        bankAccounts.put(newID, newAccount);

        return newAccount;
    }

    public BankAccount getAccountByID(int id) {
        return bankAccounts.get(id);
    }

    private int generateAccountID() {
        return ++uniqueAccountID;
    }

    public double getTotalAccountsValue() {
        double sum = 0.00;

        for (BankAccount bankAccount: bankAccounts.values()) {
            sum += bankAccount.getBalance();
        }

        return sum;
    }

}
