package edu.neu.csye7374;

/***
 * Class representing an item in the menu
 */
public class Item {

	private int id;
	private double price;
	private String description;

	public Item(int id, double price, String description) {
		this.id = id;
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item{" + "id = " + id + ", price = " + price + ", description = '" + description + '\'' + '}';
	}
}
