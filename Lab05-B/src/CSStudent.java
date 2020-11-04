
/**
 * @author Kyle Evangelisto
 * Sub-Class CS student extends a Student
 */
public class CSStudent extends Student{
	private double labGrade;

	public CSStudent(double midtermX, double finalX, double labGrade) {
		super(midtermX, finalX);
		this.labGrade = labGrade;
	}
	
	
	/**
	 * Calls the super method calculate GPA * 75 %
	 * and adds 25% of the lab grade
	 */
	@Override
	public double calculateGPA() {
		return (super.calculateGPA() * 0.75) + (0.25 * labGrade);
		//75% of the average of midtermX and finalX
		//25% of the value of labGrade
	}
	
	//no getters or setters for this lab.
}
