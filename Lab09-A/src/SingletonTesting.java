/**
 *   OOPDA Lab09-A 
 *   Demo method for Singleton tests
 *   Will need to revise 
 *   as you make TicketMachine a Singleton
 * 
 * @author Kyle Evangelisto
 *
 */
public class SingletonTesting {

	public static void main(String[] args) {
		
		//Utilize getInstance() 
		System.out.println("Tm1 Price = " + TicketMachine.getInstance().getPrice());
		TicketMachine.getInstance().printTicket(); //print ticket
		
		
		//Part 2
		
		//add a line of code to instantiate a second TicketMachine object with, say, 
		//a different price than that in the first, and demonstrate functionality.
		
		/**	
		 * 
		 * TicketMachine tm3 = new TicketMachine(1000);
		 * TicketMachine tm4 = new TicketMachine(2000);
		 * System.out.println("Tm3 Balance = " + tm3.getBalance());
		 * System.out.println("Tm4 Balance = " + tm4.getBalance()); 
		 *
		 */
		
	   

	}

}
