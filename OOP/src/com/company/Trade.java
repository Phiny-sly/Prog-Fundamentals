package com.company;

public class Trade
{
	public String id;
	public String symbol;
	public int quantity;
	private double price;



	public Trade(String id,String symbol,int quantity,double price)
		{
			this.id = id;
			this.symbol=symbol;
			this.quantity=quantity;
			this.price=price;

		}

	public Trade(String id,String symbol,int quantity)
		{
			this.id = id;
			this.symbol=symbol;
			this.quantity=quantity;

		}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new IllegalArgumentException("Price value can not be negative");
		}
		}
	public double getPrice()
		{
			return this.price;
		}

									

	public String toString()
		{
			return "Trade \n"+" ID-" +id+"\n Symbol - "+symbol+"\n quantity - "+quantity+"\n price "+price;
																
		}

		public static void main(String[] args)
		{
			Trade trade = new Trade("T1","APPL",100,15.25);
			System.out.println(trade.toString());
		}

										
}

