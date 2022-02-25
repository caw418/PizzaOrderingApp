package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pizza;

public class App {

	private static final String TOMATO_BASE = "Tomato Base";
	private static final String BARBECUE_BASE = "Barbecue Base";
	private static final String CHEESE = "Cheese";
	private static final String PEPPERONI = "Pepperoni";
	private static final String PINEAPPLE = "Pineapple";
	private static final String CHICKEN = "Chicken";
	private static final String SAUSAGE = "Sausage";
	private static final String PORK = "Pork";
	private static final String OLIVES = "Olives";
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int userInput;
		String base = null;
		ArrayList<String> toppings = new ArrayList<>();
		boolean done = false;
		
		System.out.println("Hi, Welcome to Naruke Pizza!");
		
		do
		{
			System.out.println("What base do you want? 1 - Tomato Base, 2 - Barbecue Base");
			userInput = console.nextInt();
			switch(userInput)
			{
			case 1:
				base = TOMATO_BASE;
				done = true;
				break;
			case 2:
				base = BARBECUE_BASE;
				done = true;
				break;
			default:
				System.out.println("Please select a valid option.");
				break;
			}
		}
		while(!done);
		
		do
		{
			System.out.println("What toppings do you want?");
			System.out.println("1 - Cheese");
			System.out.println("2 - Pepperoni");
			System.out.println("3 - Pineapple");
			System.out.println("4 - Chicken");
			System.out.println("5 - Sausage");
			System.out.println("6 - Pork");
			System.out.println("7 - Olives");
			userInput = console.nextInt();
			switch(userInput)
			{
			case 1:
				toppings.add(CHEESE);
				break;
			case 2:
				toppings.add(PEPPERONI);
				break;
			case 3:
				toppings.add(PINEAPPLE);
				break;
			case 4:
				toppings.add(CHICKEN);
				break;
			case 5:
				toppings.add(SAUSAGE);
				break;
			case 6:
				toppings.add(PORK);
				break;
			case 7:
				toppings.add(OLIVES);
				break;
			}
			System.out.println("Add another topping? 1 - Yes, 2 - No");
			userInput = console.nextInt();
		}
		while(userInput == 1);
		Pizza pizza = new Pizza(base, toppings);
		System.out.println("You ordered: " + pizza);
	}
}