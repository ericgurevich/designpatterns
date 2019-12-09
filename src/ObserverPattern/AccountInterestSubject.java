package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class AccountInterestSubject implements Subject {
    private List<Integer> interestEarningAccounts;
    private double interestRate;

    public AccountInterestSubject() {
        interestRate = 0;
        interestEarningAccounts = new ArrayList<>();
    }

    @Override
    public void register(Object accountID) {
        interestEarningAccounts.add((Integer)accountID);
    }

    public void unregister(Object accountID) {
        interestEarningAccounts.remove(accountID);
    }

    public void notifyObservers() {
        BankAccount bankAccount;
        for (int id : interestEarningAccounts) {
            bankAccount = BankSingleton.getInstance().getAccountByID(id);
            bankAccount.update(bankAccount.getBalance() * interestRate);
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
