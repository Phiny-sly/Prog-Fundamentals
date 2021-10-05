package com.company;

public class Account {

    private double tradeValue;

    public Account(double tradeValue)
            
    {
        this.tradeValue = tradeValue;
    }

    public void setTradeValue(double tradeValue)
    {
        this.tradeValue = tradeValue;
    }
    public double getTradeValue()
    {
        return tradeValue;
    }
}
