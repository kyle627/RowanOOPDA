
public class Simulator  {
	
	private static int[] matrixScore(Behavior aLast, Behavior bLast) {
		int [] output = new int[2]; 
		if(aLast == Behavior.COOPERATE) {
	   	 	if(bLast == Behavior.COOPERATE) {
	   	 		output[0] = 3;
	   	 		output[1] = 3;
	   	 		return output;
	   	 	}
	   		else {
	   			output[0] = 0;
	   	 		output[1] = 5;
	   			return output; 
	   		}
	   		 
	    } else {
	   	 if(bLast == Behavior.COOPERATE) {
	   		output[0] = 5;
   	 		output[1] = 0;
   	 		return output;
	   	 }
	   		 
	   	 else {
	   		output[0] = 1;
   	 		output[1] = 1;
   	 		return output;
	   	 }
	   		 
	    }
	}

	
}
