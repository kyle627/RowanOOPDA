import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	
	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<>();
		roster.add(new Student("Kyle" ,"Evangelisto"));
		roster.add(new Student("Aidan", "Murphey"));
		roster.add(new Student("Angel", "Avelar"));
		roster.add(new Student("Sean", "McKay"));
		display(roster); 
		Collections.sort(roster);
		System.out.println("\nby Last Ascending:");
		display(roster);
	}
	
	public static void display(ArrayList<Student> section){
		for(Student s : section) {
			System.out.println(s);
		}
	}
	
}
