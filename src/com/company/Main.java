package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Client dzifa = new Client("dzifa", "hodey");
        Trade tesla = new BondTrade("tesla", "TS", 1000, 10.00, 200.00);
//        Trade tesla1 = new BondTrade("tesla1", "TS", 10000, 3350.00, 200.00);


        dzifa.addTrade(tesla);
        dzifa.addTrade(tesla);
        dzifa.addTrade(tesla);
        dzifa.addTrade(tesla);

        dzifa.addTrade(tesla);

//        dzifa.addTrade(tesla);
//        System.out.println(dzifa.canTrade());
//        System.out.println(dzifa.getTradeList().size());
        System.out.println(dzifa.getMembershipType());

    }
}
