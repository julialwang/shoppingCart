import java.text.*;

public class Item {
	
	private String name;
	private int quantity;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	
	// constructor for new item
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		if(price < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	// bulk constructor for new item
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		this.name = name;
		this.price = price;
		this.bulkQuantity = bulkQuantity;
		this.bulkPrice = bulkPrice;
		if(price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	// returns quantity for item bought in bulk
	public double priceFor(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException();
		}
		double finalPrice = 0;
		while(quantity >= this.bulkQuantity) {
			quantity -= this.bulkQuantity;
			finalPrice += this.bulkPrice;
		}
		finalPrice += quantity * price;
		return finalPrice;
	}
	
	// prints prices given bulk purchase information
	public String toString() {
		String string = name + ", " + price;
		if(this.bulkPrice != 0) {
			string += (" (" + bulkQuantity + " for " + bulkPrice + ")");
		}
		return string;
	}
	
	
}
