/**
 * 
 * @author Kyle Evangelisto
 * Throws exceptions for an insufficient balance
 */
@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException() {
		super("Insufficient Balance");
	}
	
	public InsufficientBalanceException(String balance) {
		super("Insufficient balance " + balance);
	}
	
}
