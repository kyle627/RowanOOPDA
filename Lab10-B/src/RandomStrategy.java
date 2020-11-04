import java.util.Random;

public class RandomStrategy implements Strategy {

	Random rand = new Random();

	@Override
	public RPS choose(RPS last) {
		int output = rand.nextInt(3);
		RPS answer;
		if(output == 0) {
			answer = RPS.ROCK;
		} else if (output == 1) {
			answer = RPS.PAPER;
		} else {
			answer = RPS.SCISSORS;
		}
		return answer;
	}
	
	
	
}
