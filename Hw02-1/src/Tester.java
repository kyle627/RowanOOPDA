
/**
 * @author Kyle Evangelisto
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		GroceryBag shoppingCart = new GroceryBag();
		
		shoppingCart.addItem("goldfish", 400); //remember values in cents
		shoppingCart.addItem("goldfish", 400);
		shoppingCart.addItem("cupcakes", 499);
		shoppingCart.addItem("soda", 99);
		
		System.out.println("Total value of shopping cart (cents): " + shoppingCart.getTotalValue() + "\n" +
				"Amount of items in cart with description: 'goldfish' " + shoppingCart.countItems("goldfish") + "\n" + 
					"Is there 'soda' in your shopping cart? " + shoppingCart.isInBag("soda"));

	}

}
