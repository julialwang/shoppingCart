import java.util.*;

public class ShoppingCart {

	private ArrayList<ItemOrder> shoppingCart;
	private boolean value;
	
	// constructor for shopping cart
	public ShoppingCart() {
		shoppingCart = new ArrayList<ItemOrder>();	
	}
	
	// adds new item order to shopping cart
	public void add(ItemOrder itemOrder) {
		for(int i = 0; i < shoppingCart.size(); i++) {
			if(itemOrder.getItem() == shoppingCart.get(i).getItem()) {
				shoppingCart.remove(shoppingCart.get(i));
			}
		}
		shoppingCart.add(itemOrder);
	}
	
	// establishes presence of discount
	public void setDiscount(boolean value) {
		this.value = value;
	}
	
	// gets total price of shopping cart
	public double getTotal() {
		double total = 0;
		for(int i = 0; i < shoppingCart.size(); i++) {
			total += shoppingCart.get(i).getPrice();
		}
		if(value == true) {
			total *= 0.9;
		}
		return total;
	}
}
