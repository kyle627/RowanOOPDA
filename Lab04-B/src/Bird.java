/**
 * @author Kyle Evangelisto
 * date:  9 / 23 / 2020
 * Professor Weissman
 */
public class Bird {
	private String  birdID;
	private int hoursSincelastMeal;
	private boolean inflight;
	
	public Bird(String birdID, int hoursSincelastMeal, boolean inflight) {
		super();
		this.birdID = birdID;
		this.hoursSincelastMeal = hoursSincelastMeal;
		this.inflight = inflight;
	}

	public String getBirdID() {
		return birdID;
	}

	public void setBirdID(String birdID) {
		this.birdID = birdID;
	}

	public int getHoursSincelastMeal() {
		return hoursSincelastMeal;
	}

	public void setHoursSincelastMeal(int hoursSincelastMeal) {
		this.hoursSincelastMeal = hoursSincelastMeal;
	}

	public boolean isInflight() {
		return inflight;
	}

	public void setInflight(boolean inflight) {
		this.inflight = inflight;
	}

	@Override
	public String toString() {
		return "Bird [birdID=" + birdID + ", hoursSincelastMeal=" + hoursSincelastMeal + 
				", inflight=" + inflight + "]";
	}
	
	
	
	
}
