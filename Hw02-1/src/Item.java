
/**
 * @author Kyle Evangelisto
 * Represents a grocery store item.
 */
public class Item {
	
	private String description;
	private int value; //in cents
	
	public Item(String description, int value) {
		super();
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Item [description=" + description + ", value=" + value + "]";
	}
	
	
}
