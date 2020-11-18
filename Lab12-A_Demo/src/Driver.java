import java.util.*;


public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Info> people = new ArrayList<>();
		people.add(new Info("Kyle", 20));
		people.add(new Info("Aidan", 20));
		people.add(new Info("Shania", 21));
		people.add(new Info("Sean", 21));
		people.add(new Info("Gabrielle", 21));
		
		people.forEach(p-> System.out.println(p.toString()));
		System.out.println();
		people.stream().forEach(p-> System.out.println(p));
		System.out.println();
		people.stream().filter(p-> p.getAge() >= 21).forEach(p-> System.out.println(p));
		System.out.println();
		people.stream().map(p-> p.getAge()).forEach(a-> System.out.println(a));
		System.out.println();
		int ages = people.stream().map(p-> p.getAge()).reduce(0, (counter, age) -> counter + age);
		System.out.println(ages);
		
		
	}

}
