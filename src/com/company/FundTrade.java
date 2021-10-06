package com.company;

public class FundTrade extends Trade {
    private final double percentage;
    private double dividend;

    public FundTrade(String id, String symbol, int quantity, double price, double percentage) {
        super(id, symbol, quantity, price);
        this.percentage = percentage;
    }

    @Override
    double calcDividend() {
        dividend = this.percentage * super.getPrice();
        return dividend;
    }
}
