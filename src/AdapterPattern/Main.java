package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        BankSingleton bank = BankSingleton.getInstance();
        int bankAccountID = bank.addCheckingAccount(1000.00).getID();

        OtherBank otherBank = new OtherBank();
        int otherBankAccountID = otherBank.addAccount(2000.00).getID();

        BankAdapter bankAdapter = new OtherBankAdapter(otherBank);
        bankAdapter.transferOtherBank(BankAdapter.TransferDirection.TO_OTHER_BANK, bankAccountID, otherBankAccountID, 500.00);

        System.out.println(bank.getAccountByID(bankAccountID).getBalance());
        System.out.println(otherBank.getAccountByID(otherBankAccountID).getBalance());
    }
}
