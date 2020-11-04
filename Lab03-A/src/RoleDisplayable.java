/**
 * 
 * @author Kyle Evangelisto
 *
 */
public interface RoleDisplayable {
	
	abstract String getName(); //Get a students name
	
	/**
	 * A default method for retrieving the person's name.
	 * Displays role as a student by default, hens default
	 */
	default void displayNameAndRole() {
		if(this instanceof Student) {
			System.out.println(getName() + ", Student");
		}
	}
	
}
