
public class Student implements Comparable<Student> {
	private String name, lastName;

	
	public Student(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Student student) {
		int compare = this.name.compareTo(student.getName());
		if(compare != 0) {
			//The names are different names
			return compare;
		} else {
			//compare by last name
			compare = this.lastName.compareTo(student.getLastName());
			return compare;
		}
	}
	
	
}
