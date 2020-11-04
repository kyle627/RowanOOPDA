
public class Context {
	Strategy strategy;
	
	public Context(Strategy last) {
		this.strategy = last;
	}
	
	public RPS executeStrategy(RPS last) {
		return strategy.choose(last);
	}
	
}
