package org.shkim.factory;

public class Ticket implements Product {

	private String name;
	private int price;

	public Ticket(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String get_name() {
		return this.name;
	}
	@Override
	public int get_price() {
		return this.price;
	}
	
}
