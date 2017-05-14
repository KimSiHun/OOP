package org.shkim.factory;

public class Computer implements Product{
	private String name;
	private int price;
	
	public Computer(String name, int price) {
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
	
	@Override
	public String to_string() {
	
		return Product.super.to_string();
	}
}
