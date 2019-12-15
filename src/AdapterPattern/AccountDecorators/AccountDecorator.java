package AdapterPattern.AccountDecorators;

import AdapterPattern.BankAccount;

public abstract class AccountDecorator implements BankAccount {
    protected BankAccount bankAccount;

    public AccountDecorator(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public abstract void updateAccountType();
}
