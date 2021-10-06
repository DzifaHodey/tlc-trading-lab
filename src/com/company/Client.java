package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membershipType = null;
    ArrayList<Trade> tradeList;
    private int points;
    private final double maxSilverValue = 10000.00;
    int totalTradesToday;
    double totalValue;
    Map<LocalDate, Trade> tradeTimeStamp = new HashMap<>();



    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tradeList = new ArrayList<Trade>();
        this.points = 0;
    }

    public boolean canTrade() {
        totalValue = 0;
        totalTradesToday=0;
        
        // If trade list is not empty
        if (!this.tradeList.isEmpty()) {
            if (this.membershipType.getMembershipType().equals("Silver") && totalValue >= maxSilverValue) {
                return false;
            }
            if (this.membershipType.getMembershipType().equals("Bronze") && LocalTime.now().isBefore(LocalTime.of(10, 0))) {
                return false;
            }

            for (Trade t : this.tradeList) {
                if (tradeTimeStamp.containsKey(LocalDate.now())) {
                    totalValue += t.getPrice() * t.getQuantity();
                    totalTradesToday++;
                }
            }
            return totalTradesToday < membershipType.getDailyTradeLimit();
        }
        // If trade list is empty
        return true;
    }

    public void setMembershipType() {
        if (this.points >= 1 && this.points <= 9) {
            this.membershipType = new BronzeMembership();
        } else if (this.points >=10 && this.points <= 19) {
            this.membershipType = new SilverMembership();
        } else if (this.points >= 20) {
            this.membershipType = new GoldMembership();
        }
    }

    public String getMembershipType() {
        return this.membershipType.getMembershipType();
    }

    public void addTrade(Trade newTrade) throws Exception {
        if (this.canTrade()) {
            tradeList.add(newTrade);
            this.points++;
            setMembershipType();
            tradeTimeStamp.put(LocalDate.now(), newTrade);
        } else throw new Exception("Trade limit exceeded. Try again tomorrow.");

    }

    public ArrayList<Trade> getTradeList() {
        return tradeList;
    }
}
