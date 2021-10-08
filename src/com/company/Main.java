package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Client dzifa = new Client("dzifa", "hodey");
        Trade tesla = new BondTrade("tesla", "TS", 1000, 10.00, 200.00);
        Trade tesla1 = new BondTrade("tesla1", "TS", 10000, 3350.00, 200.00);

//        Trade t1 = new BondTrade("ja", "df", 20, 67.00);
        dzifa.addTrade(tesla);
        dzifa.addTrade(tesla1);
        System.out.println(dzifa.getTradeList());
        dzifa.addTrade(tesla);
//        dzifa.addTrade(tesla);

////        dzifa.addTrade(tesla);
        ArrayList<Trade> newlist = new ArrayList<Trade>();
        newlist.add(tesla);
        newlist.add(tesla1);
//        newlist.add(tesla1);
        System.out.println(newlist.stream().anyMatch(trade -> trade.getId().equals("tesla2")));


//        dzifa.addTrade(tesla);
//        System.out.println(dzifa.canTrade());
//        System.out.println(dzifa.getTradeList().size());
//        System.out.println(dzifa.getMembershipType());

    }
}
