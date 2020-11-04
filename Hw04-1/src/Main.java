import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<>();
		
		roster.add(new Student("Evangelisto" , "Kyle" , 1 , 20000607));
		roster.add(new Student("Murphey" , "Aidan" , 2 , 20000101));
		roster.add(new Student("Avelar" , "Angel" , 3 , 20000102));
		roster.add(new Student("MacCauley" , "Robert" , 4 , 20000103));
		roster.add(new Student("McKay" , "Sean" , 5 , 20000104));
		roster.add(new Student("Croall" , "Keven" , 6 , 20000105));
		roster.add(new Student("Zoyac" , "Steve" , 7 , 20000106));
		roster.add(new Student("Duller" , "Enrico" , 8 , 20000107));
		roster.add(new Student("Dominach" , "Tom" , 9 , 20000108));
		roster.add(new Student("Duller" , "Rex" , 10 , 20000109));
		
		//print the unsorted roster
		System.out.println("Roster before sort:");
		for(Student student : roster) {
			System.out.println(student);
		}
		
		displayByName(roster); //output for sorted roster by name
		displayByIDAscending(roster); //output for sorted roster by ID ascending
		displayByIDDescending(roster); //output for sorted roster by ID descending
		displayByBirthdate(roster); //output for sorted roster by birthdate
		
	}
	
	/**
	 * Display method that sorts and displays roster via sortingByName
	 * @param roster
	 */
	public static void displayByName(ArrayList<Student> roster) {
		Comparator<Student> sortingByName = (Student s1, Student s2) -> 
			s1.getFirstName().compareTo(s2.getFirstName());
		System.out.println("\nRoster After Sort by FIRST Name:");
		roster.sort(sortingByName);
		for(Student student : roster) {
			System.out.println(student);
		}
	}
	/**
	 * Display method that sorts and displays roster via displayByIDAscending
	 * @param roster
	 */
	public static void displayByIDAscending(ArrayList<Student> roster) {
		Comparator<Student> sortingByIDAscending = (Student s1, Student s2) -> 
			s1.getStudentID().compareTo(s2.getStudentID());
		System.out.println("\nRoster After Sort by ID ASCENDING:");
		roster.sort(sortingByIDAscending);
		for(Student student : roster) {
			System.out.println(student);
		}
	}
	/**
	 * Display method that sorts and displays roster via displayByIDDescending
	 * @param roster
	 */
	public static void displayByIDDescending(ArrayList<Student> roster) {
		Comparator<Student> sortingByIDDescending = (Student s1, Student s2) -> 
			s2.getStudentID().compareTo(s1.getStudentID());
		System.out.println("\nRoster After Sort by ID DESCENDING:");
		roster.sort(sortingByIDDescending);
		for(Student student : roster) {
			System.out.println(student);
		}
	}
	/**
	 * Display method that sorts and displays roster via displayByBirthdate
	 * @param roster
	 */
	public static void displayByBirthdate(ArrayList<Student> roster) {
		Comparator<Student> sortingByBirthdate = (Student s1, Student s2) -> 
			s1.getBirthDate().compareTo(s2.getBirthDate());
		System.out.println("\nRoster After Sort by Birthdate:");
		roster.sort(sortingByBirthdate);
		for(Student student : roster) {
			System.out.println(student);
		}
	}

}
