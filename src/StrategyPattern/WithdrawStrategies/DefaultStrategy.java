package StrategyPattern.WithdrawStrategies;

import StrategyPattern.WithdrawStrategy;

public class DefaultStrategy implements WithdrawStrategy {
    @Override
    public double calculateMaxWithdraw(double balance) {
        return balance * 0.9;
    }
}
