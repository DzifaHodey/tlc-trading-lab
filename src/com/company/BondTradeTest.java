package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    @Test
    void calcDividendTest() {
        BondTrade trade1 = new BondTrade("trade1", "TSGk", 100, 7000.00, 200.00);
        assertEquals(200.00, trade1.calcDividend());
    }
}