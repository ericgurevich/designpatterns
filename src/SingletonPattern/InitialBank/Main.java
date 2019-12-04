package SingletonPattern.InitialBank;

public class Main {
    public static void main(String[] args) {
        BankSingleton bankSingleton = BankSingleton.getInstance();

        bankSingleton.addAccount(1000.00);
    }
}
