import java.util.*;


/**
 * @author Kyle Evangelisto
 * Represents a grocery bag
 */
public class GroceryBag {
	private ArrayList<Item> shoppingCart;

	public GroceryBag() {
		super();
		shoppingCart = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param description
	 * @param value
	 */
	public void addItem(String description, int value) {
		shoppingCart.add(new Item(description, value));
	}
	
	/**
	 * 
	 * @return total
	 */
	public int getTotalValue() {
		int total = 0;
		for(Item item : shoppingCart) {
			total += item.getValue();
		}
		return total;
	}
	
	/**
	 * 
	 * @param description
	 * @return count
	 */
	public int countItems(String description) {
		int count = 0;
		for(Item item : shoppingCart) {
			if(description == item.getDescription()) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 
	 * @param description
	 * @return boolean
	 */
	public boolean isInBag(String description) {
		for(Item item : shoppingCart) {
			if(description == item.getDescription()) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "GroceryBag [shoppingCart=" + shoppingCart + "]";
	}
	
	
}
