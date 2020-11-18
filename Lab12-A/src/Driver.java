/**
 * Driver to test Animal Monitoring
 *   for OOPDA Lab 12-2, SU20
 * 
 * @author Kyle Evangelisto
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		AnimalMonitor am = new AnimalMonitor();
		am.addSightings("sightings.csv");  //load the file
		am.printList();   //display all the sightings
		System.out.println();
		am.printSightingsOf("Mountain Gorilla");
	}

}