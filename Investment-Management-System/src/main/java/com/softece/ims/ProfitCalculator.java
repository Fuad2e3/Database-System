package com.softece.ims;

public class ProfitCalculator {
    public double calculateProfit(double balance, double profitPercentage) {
        return (balance * profitPercentage) / 100;
    }
}

