import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kyle Evangelisto
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		ArrayList<Item> shoppingCart = new ArrayList<>();
		
		shoppingCart.add(new Item("Bread", 499));
		shoppingCart.add(new Item("Eggs", 99));
		shoppingCart.add(new Item("Milk", 79));
		shoppingCart.add(new Item("Cheese", 100));
		
		Collections.sort(shoppingCart); //sorts alphabetically via description
		listAllItems(shoppingCart); //calls output method

	}
	/**
	 * Outputs alphabetically via description
	 * @param shoppingCart ArrayList<Item>
	 */
	public static void listAllItems(ArrayList<Item> shoppingCart) {
		for(Item item : shoppingCart) {
			System.out.println(item);
		}
	}

}
