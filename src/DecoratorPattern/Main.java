package DecoratorPattern;

import DecoratorPattern.AccountDecorators.HighInterestAccountDecorator;
import DecoratorPattern.AccountDecorators.JointAccountDecorator;

public class Main {
    public static void main(String[] args) {
        BankSingleton bank = BankSingleton.getInstance();

        BankAccount bankAccount = bank.addCheckingAccount(1000.00);
        bankAccount = new HighInterestAccountDecorator(bankAccount);
        bankAccount = new JointAccountDecorator(bankAccount, 1);

        bankAccount.updateAccountType();
    }
}
