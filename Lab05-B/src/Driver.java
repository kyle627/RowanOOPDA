/**
 * @author Kyle Evangelisto
 * Professor Weissman
 */
public class Driver {
	
	public static void main(String[] args) {
		
		Student student = new Student(70, 65); //'70' represents a non CS mid-term; 60, the final
		double studentGPA = student.calculateGPA();
		System.out.println("Student GPA: " + studentGPA);
		
		CSStudent csstudent = new CSStudent(80 , 90 , 100); 
		//'80' represents a cs student mid-term, 85, the final and 100 for a lab
		double csstudentGPA = csstudent.calculateGPA();
		System.out.println("CS Student GPA: " + csstudentGPA);
	}
}
