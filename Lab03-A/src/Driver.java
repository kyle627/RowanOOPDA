import java.util.ArrayList;

/**
 * 
 * @author Kyle Evangelisto
 * A driver method
 * Adds students and instructors to an array list, iterates through them and prints 
 * their name and role using the displayNameAndRole() method.
 *
 */

public class Driver {

	public static void main(String[] args) {
		ArrayList<RoleDisplayable> classroom = new ArrayList<>();
		
		/**Add students to the classroom**/
		classroom.add(new Student("Kyle"));
		classroom.add(new Student("Aidan"));
		classroom.add(new Student("Sean"));
		classroom.add(new Student("Steven"));
		classroom.add(new Student("Robert"));
		classroom.add(new Student("David"));
		classroom.add(new Student("Angel"));
		classroom.add(new Student("Joanna"));
		classroom.add(new Student("Enrico"));
		classroom.add(new Student("Keven"));
		
		/**Add Instructors to the classroom**/
		classroom.add(new Instructor("Professor Weissman"));
		classroom.add(new Instructor("LA 1"));
		classroom.add(new Instructor("LA 2"));
		
		/**Print name and role to console.**/
		for(RoleDisplayable displayName : classroom) {
			displayName.displayNameAndRole();
		}
	}

}
