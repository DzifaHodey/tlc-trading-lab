package com.company;

public abstract class MembershipType {
    private int dailyTradeLimit;

    public MembershipType(int dailyTradeLimit) {
        this.dailyTradeLimit = dailyTradeLimit;
    }


    public int getDailyTradeLimit(){
        return dailyTradeLimit;
    }

    public abstract String getMembershipType();
}
