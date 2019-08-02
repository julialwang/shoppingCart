
public class ItemOrder {

	private Item item;
	private int quantity;
	
	// constructor to order amounts of items
	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	// returns price of item
	public double getPrice() {
		return item.priceFor(quantity);
	}
	
	// gets item
	public Item getItem() {
		return item;
	}
}
