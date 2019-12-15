package AdapterPattern;

public interface BankAccount extends Observer {
    double getBalance();
    int getID();
    void updateAccountType();
}
