package ObserverPattern.WithdrawStrategies;

import ObserverPattern.WithdrawStrategy;

public class Sub500Strategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return 0;
    }
}
