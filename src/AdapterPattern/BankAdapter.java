package AdapterPattern;

public interface BankAdapter {

    public enum TransferDirection {
        TO_OTHER_BANK,
        FROM_OTHER_BANK
    }

    void transferOtherBank(TransferDirection transferDirection, int bankAccountID, int otherBankAccountID, double amount);
}
