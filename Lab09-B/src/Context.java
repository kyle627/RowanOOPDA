
public class Context implements Strategy {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public Behavior executeStrategy(Behavior opponentLastChoice) {
		return strategy.compete(opponentLastChoice);
	}

	@Override
	public Behavior compete(Behavior opponentLastChoice) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
}
