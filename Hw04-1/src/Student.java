/**
 * @author Kyle Evangelisto
 * Hw 04-1
 */
public class Student {
	
	private String lastName, firstName;
	private Integer studentID, birthDate; //YYYYMMDD
	
	public Student(String lastName, String firstName, Integer studentID, Integer birthDate) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = studentID;
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Integer getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", studentID=" + studentID
				+ ", birthDate=" + birthDate + "]";
	}
	
}
