
import java.util.*;

public class RandomPick implements Strategy{

	@Override
	public Behavior compete(Behavior opponentLastChoice) {
		// TODO Auto-generated method stub
		return null;
	}
	
	int rand;

	public Behavior getStrategy(){
		
		Random random = new Random();
		
		rand = random.nextInt(2);
		if(rand == 1){
			return Behavior.COOPERATE;
		}
		else{
			return Behavior.DEFECT;
		}

	}


}
