package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType = null;
    ArrayList<Trade> tradeList;
    private int points;
    private final double maxSilverValue = 10000.00;


    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tradeList = new ArrayList<Trade>();
        this.points = 0;
    }

    public void setMembershipType() {
        if (this.points >= 1 && this.points <= 9) {
            this.membershipType = new BronzeMembership();
        } else if (this.points >= 10 && this.points <= 19) {
            this.membershipType = new SilverMembership();
        } else if (this.points >= 20) {
            this.membershipType = new GoldMembership();
        }
    }

    public void addTrade(Trade newTrade) throws Exception {
        if (this.canTrade()) {
            tradeList.add(newTrade);
            this.points++;
            setMembershipType();
        } else throw new Exception("Trade limit exceeded. Try again tomorrow.");

    }

    public boolean canTrade() {
        int totalTradesToday = 0;
        double totalValue = 0;

        if (!this.tradeList.isEmpty()) {
            if (this.membershipType.getMembershipType().equals("Silver") && totalValue == maxSilverValue) {
                return false;
            }
            if (this.membershipType.getMembershipType().equals("Bronze") && LocalTime.now().isBefore(LocalTime.of(10, 0))) {
                return false;
            }

            for (Trade t : this.tradeList) {
                if (t.getDateCreated().equals(LocalDate.now())) {
                    totalValue += t.getPrice() * t.getQuantity();
                    totalTradesToday++;
                }
            }
            return totalTradesToday < membershipType.getDailyTradeLimit();
        }
        return true;


    }
}
