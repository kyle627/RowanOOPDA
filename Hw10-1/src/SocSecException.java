/**
 * 
 * @author Kyle Evangelisto
 * Throws exception for improper SSN
 *
 */
@SuppressWarnings("serial")
public class SocSecException extends Exception{

	public SocSecException() {
		super("Incorrect SSN");
	}
	
	public SocSecException(String msg) {
		super("Incorrect SSN: " + msg);
	}
	
}
