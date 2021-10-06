package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Trade> tradeList = new ArrayList<>();
    private double totalValue =0;


    public double getTotalValue() {
        return totalValue;
    }

    public double setTotalValue() {
        totalValue = 0;
        for (Trade t : tradeList) {
            totalValue += t.getPrice() * t.getQuantity();
        }
        return totalValue;
    }



}
