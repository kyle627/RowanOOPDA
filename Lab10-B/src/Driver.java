import java.util.Scanner;

/**
 * Kyle Evangelisto
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Best of how many games? ");
		int games = scan.nextInt();
		
		for(int i = 0; i < games; i++) {
			Context player1 = new Context(new RandomStrategy());
			Context player2 = new Context(new RandomStrategy());
			RPS choiceA = player1.executeStrategy(RPS.PAPER);
			RPS choiceB = player2.executeStrategy(RPS.PAPER);
			
			System.out.println(toString(choiceA, choiceB));
		}
		
		scan.close();
		
	}
	
	/**
	 * @param choice1
	 * @param choice2
	 * @return The player who won the round.
	 * Assume choice1 represents an already created Context
	 * playerA "A", and choice2 represents an already created context player2 "B"
	 */
	public static String returnWinner(RPS choice1, RPS choice2) {
		/**
		 * I know this isn't the most "efficient" rock paper scissors logic
		 * but I mean it works for this lab.
		 */
		
		String winner = "";
		
		if(choice1 == RPS.ROCK) {
			if(choice2 == RPS.SCISSORS) {
				winner += "A";
			} else if(choice2 == RPS.PAPER) {
				winner += "B";
			} else {
				winner += "Tie";
			}
		}
		if(choice1 == RPS.PAPER) {
			if(choice2 == RPS.ROCK) {
				winner += "A";
			} else if(choice2 == RPS.SCISSORS) {
				winner += "B";
			} else {
				winner += "Tie";
			}
		}
		if(choice1 == RPS.SCISSORS) {
			if(choice2 == RPS.PAPER) {
				winner += "A";
			} else if(choice2 == RPS.ROCK) {
				winner += "B";
			} else {
				winner += "Tie";
			}
		}
		
		return winner;
	}
	
	public static String toString(RPS choiceA, RPS choiceB) {
		return  "A choice: " + choiceA + 
				"\nB choice: " + choiceB + 
				"\nWinner is: " + returnWinner(choiceA, choiceB) +
				"\n";
	}

}
