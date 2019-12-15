package AdapterPattern;

public class OtherBankAdapter implements BankAdapter{
    private OtherBank otherBank;
    private BankSingleton bankSingleton;

    OtherBankAdapter(OtherBank otherBank) {
        this.otherBank = otherBank;
        bankSingleton = BankSingleton.getInstance();
    }

    public void transferOtherBank(TransferDirection transferDirection, int bankAccountID, int otherBankAccountID,
                                  double amount) {
        switch (transferDirection) {
            case TO_OTHER_BANK:
                otherBank.setAbleToDeposit(true);
                ((CheckingAccount) bankSingleton.getAccountByID(bankAccountID)).withdraw(amount);
                otherBank.transfer(OtherBank.TransferType.DEPOSIT, amount, otherBankAccountID);
                break;
            case FROM_OTHER_BANK:
                otherBank.setAbleToWithdraw(true);
                otherBank.transfer(OtherBank.TransferType.WITHDRAW, amount, otherBankAccountID);
                ((CheckingAccount) bankSingleton.getAccountByID(bankAccountID)).deposit(amount);
                break;
        }
    }
}
