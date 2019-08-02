import java.util.*;

public class Catalog {
	
	private String name;
	private ArrayList<Item> catalog;
	
	// constructor for catalog
	public Catalog(String name) {
		this.name = name;
		catalog = new ArrayList<Item>();
	}
	
	// adds items to catalog
	public void add(Item item) {
		catalog.add(item);
	}
	
	// returns the current length of catalog
	public int size() {
		return catalog.size();
	}
	
	// returns item from given index
	public Item get(int index) {
		return catalog.get(index);
	}
	
	// returns name of item
	public String getName() {
		return name;
	}
}
