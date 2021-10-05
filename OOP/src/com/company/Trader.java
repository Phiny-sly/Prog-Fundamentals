package com.company;

public class Trader {

    public String name;
    Trade trade = new Trade("T1","APPL",100,15.25);
    Account a = new Account(78);

    public Trader(String name, Account a)
    {
        this.name = name;
        this.a = a;
    }

    public void addTrade(Trade trade)
    {
        this.a.setTradeValue(this.a.getTradeValue()+(trade.quantity * trade.getPrice()));
    }

    public double toValue()
    {
       return this.a.getTradeValue();
    }
    public static void main(String[] args)
    {
        Trade trade = new Trade("T1","APPL",100,15.25);
        Account phin = new Account(50);
        Trader ayi = new Trader("Phinehas",phin);
        ayi.addTrade(trade);

        System.out.println(ayi.toValue());
    }


}
