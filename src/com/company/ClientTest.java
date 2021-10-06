package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client dzifa = new Client("dzifa", "hodey");
    Trade tesla = new BondTrade("tesla", "TS", 10000, 3350.00, 200.00);
    @Test
    void setMembershipType()  {

    }

    @Test
    void testAddTrade() throws Exception {
        dzifa.addTrade(tesla);
    }

    @Test
    void canTrade() {
        dzifa.canTrade();
    }


}