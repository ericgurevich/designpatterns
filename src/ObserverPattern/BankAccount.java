package ObserverPattern;

public interface BankAccount extends Observer{
    double getBalance();
    int getID();
    void updateAccountType();
}
