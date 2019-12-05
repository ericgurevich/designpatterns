package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        BankSingleton bankSingleton = BankSingleton.getInstance();
        bankSingleton.setBankName("FooBar National Bank");

        User user1 = new User(1);
        user1.registerAccount(500.00);
        user1.registerAccount(1000.00);

        user1.printAccountInformation();

        User user2 = new User(2);
        user2.registerAccount(500.00);

        System.out.println(bankSingleton.getTotalAccountsValue());
    }
}
