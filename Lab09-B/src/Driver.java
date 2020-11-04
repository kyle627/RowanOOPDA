/**
 * 
 * @author kylee
 * An unfinished "class" lab...gross right
 */
public class Driver implements Strategy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context playerA = new Context(Strategy s);
		Context playerB = new Context(Strategy s);
		
		int counter = 0;
		
		for(int index = 0; index < 100; index++) {
			System.out.println("A: " + playerA.getStrategy() + "\n" + 
					"B: " + playerB.getStrategy() + "\n");
		}
		
	}

	@Override
	public Behavior compete(Behavior opponentLastChoice) {
		// TODO Auto-generated method stub
		return null;
	}

}
