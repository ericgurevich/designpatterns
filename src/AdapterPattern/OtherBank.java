package AdapterPattern;

import java.util.HashMap;

public class OtherBank {
    private HashMap<Integer, OtherBankAccount> otherBankAccounts;
    private int uniqueAccountID;
    private boolean ableToWithdraw;
    private boolean ableToDeposit;

    public enum TransferType {
        WITHDRAW,
        DEPOSIT
    }

    public OtherBank() {
        uniqueAccountID = 0;
        otherBankAccounts = new HashMap<>();
        ableToWithdraw = false;
    }

    public double transfer(TransferType transferType, double amount, int accountID) {
        switch (transferType) {
            case WITHDRAW:
                if (!otherBankAccounts.containsKey(accountID)) {
                    throw new IllegalArgumentException("Account does not exist.");
                }

                return getAccountByID(accountID).withdraw(ableToWithdraw, amount);
            case DEPOSIT:
                if (!otherBankAccounts.containsKey(accountID)) {
                    throw new IllegalArgumentException("Account does not exist.");
                }

                getAccountByID(accountID).deposit(ableToDeposit, amount);
                return 0;
            default:
                throw new IllegalArgumentException("No transfer type.");
        }
    }

    public OtherBankAccount addAccount(Double initialBalance) {
        int newID = generateAccountID();
        OtherBankAccount newAccount = new OtherBankAccount(newID, initialBalance);
        otherBankAccounts.put(newID, newAccount);

        return newAccount;
    }

    private int generateAccountID() {
        return ++uniqueAccountID;
    }

    public OtherBankAccount getAccountByID(int id) {
        return otherBankAccounts.get(id);
    }

    public void setAbleToWithdraw(Boolean ableToWithdraw) {
        this.ableToWithdraw = ableToWithdraw;
    }

    public void setAbleToDeposit(Boolean ableToDeposit) {
        this.ableToDeposit = ableToDeposit;
    }

}
