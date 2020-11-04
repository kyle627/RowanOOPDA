import java.util.*;

/**
 * @author Kyle Evangelisto
 * Represents Wallet.
 */
public class Wallet {
	
	private ArrayList<Bill> wallet;

	public Wallet() {
		wallet = new ArrayList<>();
	}
	
	/**
	 * Utilizes bill add method to add bills to wallet
	 * @param value
	 * @param serialNumber
	 */
	public void addBill(int value, String serialNumber) {
		wallet.add(new Bill(value, serialNumber));
	}
	
	/**
	 * Utilizes for each to loop through bills and get total value
	 * @return total
	 */
	public int totalValue() {
		int total = 0;
		for(Bill bill: wallet) {
			total += bill.getValue();
		}
		return total;
	}
	
	/**
	 * Utilizes for each to loop through all the bills in the wallet
	 * void
	 */
	public void displayAll() {
		for(Bill bill : wallet) {
			System.out.println(bill); //toString used
		}
	}
	
	/**
	 * Counts specific valued bills in wallet and returns
	 * 
	 * @param value
	 * @return count
	 */
	public int countByValue(int value) {
		int count = 0;
		for(Bill bill : wallet) {
			if(bill.getValue() == value) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Wallet [wallet=" + wallet + "]";
	}
	
	
	
	
	
}
