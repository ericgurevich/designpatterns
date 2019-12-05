package InitialBank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("FooBar National Bank");
        bank.addAccount(500.00);
        System.out.println(bank.getAccountByID(1).getBalance());
    }
}
