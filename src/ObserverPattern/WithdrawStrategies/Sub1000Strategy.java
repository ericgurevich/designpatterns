package ObserverPattern.WithdrawStrategies;

import ObserverPattern.WithdrawStrategy;

public class Sub1000Strategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return 0;
    }
}
