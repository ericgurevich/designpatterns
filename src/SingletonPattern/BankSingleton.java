package SingletonPattern;

import java.util.HashMap;

public class BankSingleton {
    private String bankName;
    private HashMap<Integer, BankAccount> bankAccounts;
    private int uniqueAccountID;

    private static BankSingleton bankSingleton;

    private BankSingleton(){
        uniqueAccountID = 0;
        bankAccounts = new HashMap<>();
    }

    public static BankSingleton getInstance(){
        if (bankSingleton == null) {
            bankSingleton = new BankSingleton();
        }
        return bankSingleton;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
