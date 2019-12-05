package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1);
        user1.registerAccount(1100.00);

        System.out.println(user1.withdraw(1, 500.00));
    }
}
