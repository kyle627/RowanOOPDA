import java.util.*;
import java.util.function.*;

/**
 * @author Kyle Evangelisto
 * date:  9 / 23 / 2020
 * Professor Weissman
 */
public class Driver {

	public static void main(String[] args) {
		//Create a BiPredicate to check if the bird is hungry, return true or false
		BiPredicate<Bird, Integer> isHungry = (bird, hours) -> {
			hours = 3;
			if(bird.getHoursSincelastMeal() >= hours) { 
				return true; //if its been EXACTLY 3 hours (hense the >=) or more since the bird ate
			}
			return false;
		};//end BiPredicate
		
		//Create a consumer to check if the bird is hungry
		Consumer<Bird> breakForFood = bird -> {
			if(isHungry.test(bird, bird.getHoursSincelastMeal())) { //Utilize isHungry lambda
				bird.setInflight(false);
				bird.setHoursSincelastMeal(0);
				System.out.println("Bird: " + bird.getBirdID() + " is no longer flying"
						+ ", and is now feeding."); //output results
			} else {
				System.out.println("Bird: " + bird.getBirdID() + " is not hungry."); //otherwise output these results
			}
			
		};//end consumer
		
		//test birds for bullet point 1
		
		Bird testbird1 = new Bird("Bird1", 1, true);
		Bird tesbird2 = new Bird("Bird2", 8, false);
		
		breakForFood.accept(testbird1);
		breakForFood.accept(tesbird2);
		
		System.out.println("\n");
		
		//flock of birds with array list bullet point 2
		Bird flockbird1 = new Bird("Bird1", 1, true);
		Bird flockbird2 = new Bird("Bird2", 8, false);
		Bird flockbird3 = new Bird("Bird3", 3, true);
		Bird flockbird4 = new Bird("Bird4", 2, false);
		Bird flockbird5 = new Bird("Bird5", 6, true);
		
		ArrayList<Bird> flock = new ArrayList<>();
		flock.add(flockbird1);
		flock.add(flockbird2);
		flock.add(flockbird3);
		flock.add(flockbird4);
		flock.add(flockbird5);
		
		//output using for each loop bullet point 3
		for(Bird bird : flock) {
			breakForFood.accept(bird);
		}
		
	}
	

}
