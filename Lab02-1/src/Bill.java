
/**
 * @author Kyle Evangelisto
 * Represents paper US Currency.
 */
public class Bill {
	
	private int value;
	private String serialNumber;
	
	public Bill(int value, String serialNumber) {
		super();
		this.value = value;
		this.serialNumber = serialNumber;
	}

	public int getValue() {
		return value;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Bill Value: " + value + ", Serial Number: " + serialNumber;
	}

	
	
}
