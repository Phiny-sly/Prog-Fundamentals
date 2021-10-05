package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {
    Trade trade = new Trade("T1","APPL",100,15.25);
    Account a = new Account(1525);
    Trader b = new Trader("Phinehas",a);


    @Test
    void testValue()
    {
        assertEquals(1525,a.getTradeValue());
    }

}