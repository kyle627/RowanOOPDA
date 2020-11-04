
/**
 * @author Kyle Evangelsito
 *
 */
public class Tester {

	public static void main(String[] args) {
		
		Wallet myMoney = new Wallet(); //new wallet
		
		//add bills to the wallet
		
		myMoney.addBill(1, "qwerty");
		myMoney.addBill(2, "oopda");
		myMoney.addBill(5, "asdfg");
		myMoney.addBill(10, "zxcvb");
		myMoney.addBill(20, "plmok");
		
		
		
		System.out.println("Wallet has: " + myMoney.totalValue() + " dollars.");
		myMoney.displayAll(); //prints in method
		System.out.println("Wallet has: " + myMoney.countByValue(5) + " dollar bill(s).");

	}

}
