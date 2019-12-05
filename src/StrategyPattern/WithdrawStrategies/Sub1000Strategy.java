package StrategyPattern.WithdrawStrategies;

import StrategyPattern.WithdrawStrategy;

public class Sub1000Strategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return 0;
    }
}
