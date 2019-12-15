package AdapterPattern.AccountDecorators;

import AdapterPattern.BankAccount;

public class JointAccountDecorator extends AccountDecorator {
    private int jointUserID;

    public JointAccountDecorator(BankAccount bankAccount, int jointUserID) {
        super(bankAccount);
        this.jointUserID = jointUserID;
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
        System.out.println("This is a joint account with User: " + jointUserID);
    }

    @Override
    public void update(Object message) {
        //implement specific to class
    }
}
