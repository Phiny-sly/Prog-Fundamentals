package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TradeTest
{


        Trade ay = new Trade("T1", "APPL", 100, 15.25);


    @Test
    void testTradePrice() {
        assertEquals(15.25, ay.getPrice());
    }

        @Test
        void testexception()
        {

            Throwable exception = assertThrows(IllegalArgumentException.class,()->ay.setPrice(-15.25));
            assertEquals("Price value can not be negative",exception.getMessage());
        }
    }
