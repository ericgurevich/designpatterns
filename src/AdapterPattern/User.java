package AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    private List<Integer> accountIDs;

    public User(int userID) {
        this.userID = userID;
        accountIDs = new ArrayList<>();
    }

    public void registerAccount(double initialBalance) {
        accountIDs.add(BankSingleton.getInstance().addCheckingAccount(initialBalance).getID());
    }

    public void printAccountInformation() {
        BankSingleton bank = BankSingleton.getInstance();
        for (int accountID: accountIDs) {
            System.out.println("Account " + accountID + " contains $" + bank.getAccountByID(accountID).getBalance());
        }
    }

    public double withdraw(int accountID, double amount) {
        return ((CheckingAccount) BankSingleton.getInstance().getAccountByID(accountID)).withdraw(amount);
    }
}
