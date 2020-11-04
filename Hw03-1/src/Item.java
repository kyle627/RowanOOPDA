
/**
 * @author Kyle Evangelisto
 * Represents a grocery store item.
 */
public class Item implements Comparable<Item> {
	
	private String description;
	private Integer value; //in cents
	
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
	
	@Override //Compare via description
	public int compareTo(Item item) {
		int compare = this.description.compareTo(item.getDescription());
		if(compare != 0) { 
			return compare;
		} else {
			compare = this.value.compareTo(item.getValue()); 
			return compare;
		}
	}

	@Override
	public String toString() {
		return "Item [description=" + description + ", value=" + value + "]";
	}
	
	
}
