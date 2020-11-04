/**
 * 
 * @author Kyle Evangelisto 
 * Super class to Fox and Rabbit
 *
 */
public class Animal {
	
    private boolean alive;
    private Location location;
    private Field field;
    
	public Animal(boolean alive, Field field, Location location) {
		super();
		this.alive = true;
		this.location = location;
		this.field = field;
	}
	
	/**
     * Return the fox's location.
     * @return The fox's location.
     */
    public Location getLocation() {
        return location;
    }
    
    /**
    * Place the fox at the new location in the given field.
    * @param newLocation The fox's new location.
    */
   protected void setLocation(Location newLocation) {
       if(location != null) {
           field.clear(location);
       }
       location = newLocation;
       field.place(this, newLocation);
   }
   
   /**
    * Check whether the rabbit is alive or not.
    * @return true if the rabbit is still alive.
    */
   public boolean isAlive() {
       return alive;
   }
   
   /**
    * Indicate that the fox is no longer alive.
    * It is removed from the field.
    */
   protected void setDead() {
       alive = false;
       if(location != null) {
           field.clear(location);
           location = null;
           field = null;
       }
   }
   /**
    * 
    * @return field
    */
   public Field getField() {
	   return field;
   }
   /**
    * 
    * @param field
    */
   public void setField(Field field) {
	   this.field = field;
   }
    
	
}
