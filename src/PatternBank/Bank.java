package PatternBank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class Bank {
    private HashMap<Integer, BankAccount> bankAccounts;
    private Double vaultBalance;
    private int uniqueAccountID;

    public Bank(Double initialBalance) {
        this.vaultBalance = initialBalance;
        uniqueAccountID = 0;
    }

    public BankAccount addAccount(Double initalBalance) {
        int newID = generateAccountID();
        BankAccount newAccount = new BankAccount(newID, initalBalance);
        bankAccounts.put(newID, newAccount);

        return newAccount;
    }

    public BankAccount getAccountByID(int id) {
        return bankAccounts.get(id);
    }

    private int generateAccountID() {
        return ++uniqueAccountID;
    }

}
