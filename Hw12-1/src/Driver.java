import java.util.*;
import java.util.function.Predicate;

/**
 * 
 * @author Kyle Evangelisto
 *
 */
public class Driver {
	
	public static Operation add = (int a, int b) -> a + b;
		
	public static void main(String[] args) {
		question2();
		question3();
	}
	
	public static void question2() {
		Student student1 = new Student("Kyle", "CS");
		student1.setNumericIndicator(add.operation(10, 20));
		System.out.println("Student: " + student1.getName() + "\n" +
				"Major: " + student1.getMajor() + "\n" + 
				student1.getNumericIndicator() + "\n");
	}
	
	public static void question3() {
		Random rand = new Random();
		
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Kyle", "CS"));
		studentList.add(new Student("Kayla", "Math"));
		studentList.add(new Student("Connor", "Biology"));
		//Predicate (required)
		Predicate<Student> cs = student -> student.getMajor().equals("CS");
		
		//match output
		System.out.println("Setting Random values with CS filter\n" + 
				"Updated Values:");
		//use a stream (required)
		studentList.stream().forEach(s->{
			if(cs.test(s)) {
				s.setNumericIndicator(add.operation(rand1, rand2));
			}
			System.out.println("-" + s.getName() + 
						", major: " + s.getMajor() + 
						" = " + s.getNumericIndicator());
		});
	}

	
}
