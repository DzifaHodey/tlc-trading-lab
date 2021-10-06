package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {

    @Test
    void testCalcDividend() {
        FundTrade fund1 = new FundTrade("fund1", "FFRH", 500, 3490.00, 0.25);
        assertEquals(0.25*3490, fund1.calcDividend());
    }
}