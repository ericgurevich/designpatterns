package AdapterPattern.AccountDecorators;

import AdapterPattern.BankAccount;

public class HighInterestAccountDecorator extends AccountDecorator {
    public HighInterestAccountDecorator(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public int getID() {
        return bankAccount.getID();
    }

    @Override
    public void updateAccountType() {
        bankAccount.updateAccountType();
        System.out.println("This is a high interest account.");
    }

    @Override
    public void update(Object message) {
        //implement specific to class
    }
}
