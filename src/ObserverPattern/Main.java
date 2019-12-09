package ObserverPattern;

import ObserverPattern.AccountDecorators.HighInterestAccountDecorator;
import ObserverPattern.AccountDecorators.JointAccountDecorator;

public class Main {
    public static void main(String[] args) {
        BankSingleton bank = BankSingleton.getInstance();

        BankAccount bankAccount1 = bank.addCheckingAccount(1000.00);
        BankAccount bankAccount2 = bank.addCheckingAccount(2000.00);

        bank.payAccountsInterest(0.05);

        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
    }
}
