package model;

import java.util.ArrayList;

public class Pizza {
	
	private String base;
	private ArrayList<String> toppings;
	
	public Pizza(String base, ArrayList<String> toppings)
	{
		this.base = base;
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "Pizza [base=" + base + ", toppings=" + toppings + "]";
	}
}