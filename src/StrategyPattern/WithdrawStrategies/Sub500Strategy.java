package StrategyPattern.WithdrawStrategies;

import StrategyPattern.WithdrawStrategy;

public class Sub500Strategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return 0;
    }
}
