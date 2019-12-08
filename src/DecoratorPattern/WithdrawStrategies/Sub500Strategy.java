package DecoratorPattern.WithdrawStrategies;

import DecoratorPattern.WithdrawStrategy;

public class Sub500Strategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return 0;
    }
}
