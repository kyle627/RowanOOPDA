import java.util.Scanner;
/**
 * 
 * @author Kyle Evangelisto
 * Check the validity of a SSN
 */
public class SocSecProcessor {

	public static void main(String[] args) throws SocSecException {
		
		Scanner scan = new Scanner(System.in);
		String answer;
		
		do {
			System.out.print("Enter in your SSN: ");
			String input = scan.nextLine();
			try {
				System.out.println("Processing SSN " + input);
				isValid(input);
				System.out.println("No exception! Opperation succeded!");
			} catch(SocSecException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Check another SSN? (Enter 'yes' or 'no')");
			answer = scan.nextLine().toLowerCase();
		} while(answer.equals("yes") || answer.equals("y"));
			
		
		scan.close();

	}
	
	/**
	 * 
	 * @param ssn
	 * @return 
	 * @throws SocSecException
	 */
	public static boolean isValid(String ssn) throws SocSecException{
		String message = "Your SSN has the following issues: \n";
		int charIndex = 0;
		for(char c : ssn.toCharArray()) {
			if(charIndex == 3 || charIndex == 6) {
				if(c != '-') {
					message += "MISSING A '-'";
					throw new SocSecException(message);
				} 
			} else if(c < '0' || c > '9') {
				message += "INVALID NUMBER FORMAT";
				throw new SocSecException(message);
			}
			charIndex++;
		}
		if(charIndex != 11) {
			message += "INVALID LENGTH";
			throw new SocSecException(message);
		}
		return true;
	}

}
