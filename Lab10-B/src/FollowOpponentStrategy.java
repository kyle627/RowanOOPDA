
public class FollowOpponentStrategy implements Strategy {

	@Override
	public RPS choose(RPS last) {
		return last;
	}
	
}
