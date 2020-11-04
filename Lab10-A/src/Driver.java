import java.util.*;

/**
 *   Test a TicketMachine
 * @author Prof W
 */
public class Driver {

	public Driver() {   }
	
	public static void main(String[] args) throws InsufficientBalanceException {
		Scanner scan = new Scanner(System.in);
		TicketMachine tm = new TicketMachine(500);
		tm.insertMoney(200); //needs 500 to purchase
		
		try {
			
			tm.printTicket();   //sooo naive!!
			
		} catch(InsufficientBalanceException e) {
			
			System.out.println("Your balance was insufficient. Deposit more money:\nDeposit more money: ");
			tm.insertMoney(scan.nextInt());
			tm.printTicket();
			//hopefully this is what you were looking for
			
		}
		

	}


}