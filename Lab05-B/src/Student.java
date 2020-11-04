/**
 * @author Kyle Evangelisto
 * Parent-Class Student
 */

public class Student {
	private double midtermX;
	private double finalX;
	
	public Student(double midtermX, double finalX) {
		super();
		this.midtermX = midtermX;
		this.finalX = finalX;
	}
	
	/**
	 * returns the "GPA" of a student
	 *
	 */
	public double calculateGPA() {
		return (midtermX + finalX) / 2 ;
	}
	
	//no getters or setters for this lab.
}
