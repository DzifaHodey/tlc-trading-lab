package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

    Trade t1 = new BondTrade("T1", "APPL", 100, 15.3, 70);




    @org.junit.jupiter.api.Test
    void testPositivePrice(){
        t1.setPrice(12.20);
        assertEquals(12.20, t1.getPrice());
    }

    @Test
    void testNegativePrice() {
        assertThrows(IllegalArgumentException.class , () ->t1.setPrice(-30.4));
    }

    @Test
    void testSetPrice() {
        assertAll("price",
                ()-> assertEquals(15.30, t1.getPrice()),
                ()-> assertThrows(IllegalArgumentException.class , () ->t1.setPrice(-30.4)));
    }



}