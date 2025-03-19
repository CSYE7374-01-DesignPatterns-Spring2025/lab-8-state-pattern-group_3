package edu.neu.csye7374;

import java.util.Arrays;
import java.util.List;

/****
 * Class representing the Lunch menu state in the restaurant's menu system
 */
public class Lunch implements RestaurantMenuStateAPI {

	private final Menu menu;

	public Lunch() {
		this.menu = null;
	}

	public Lunch(Menu menu) {
		this.menu = menu;
	}

	// List of predefined lunch menu items
	private List<Item> lunchItems = Arrays.asList(new Item(1, 1.99, "hot dog"), new Item(2, 2.99, "salad"),
			new Item(3, 3.99, "hamburger"));

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Lunch Menu");
		for (Item i : lunchItems) {
			System.out.println(i.toString());
		}
	}

	@Override
	public void lunchMenu() {
		// TODO Auto-generated method stub
		System.out.println("Already in Lunch menu");

	}

	@Override
	public void dinnerMenu() {
		// TODO Auto-generated method stub
		menu.setstate(menu.getDinnerMenu());
	}

	@Override
	public void displayState() {
		// TODO Auto-generated method stub
		System.out.println("Lunch menu");
	}

}
