/**
 * The Trolley class represents a real-world trolley with various characteristics
 * like speed, capacity, passengers, comfort level, fuel efficiency, and amenities.
 * It provides methods to simulate basic trolley behaviors.
 *
 * @author Alvin Ly
 * @author Github Copilot
 * @author chatGPT
 */
public class Trolley {
    private int speed; // in mph
    private int capacity; // max passengers
    private int passengers; // current passengers
    private int comfortLevel; // scale 1–10
    private double fuelEfficiency; // miles per gallon equivalent
    private Amenities amenities;
  
    /**
     * Default constructor — creates a standard trolley with default settings.
     */
    public Trolley() {
      this.speed = 0;
      this.capacity = 40;
      this.passengers = 0;
      this.comfortLevel = 7;
      this.fuelEfficiency = 9.5;
      this.amenities = new Amenities(true, true, false);
    }
  
    /**
     * Overloaded constructor — creates a custom trolley with provided details.
     *
     * @param speed trolley speed
     * @param capacity passenger capacity
     * @param passengers number of current passengers
     * @param comfortLevel comfort rating
     * @param fuelEfficiency fuel efficiency in mpg
     * @param amenities amenities object
     */
    public Trolley(int speed, int capacity, int passengers, int comfortLevel,
                   double fuelEfficiency, Amenities amenities) {
      this.speed = speed;
      this.capacity = capacity;
      this.passengers = passengers;
      this.comfortLevel = comfortLevel;
      this.fuelEfficiency = fuelEfficiency;
      this.amenities = amenities;
    }
  
    // Accessors (getters)
    public int getSpeed() {
      return speed;
    }
  
    public int getCapacity() {
      return capacity;
    }
  
    public int getPassengers() {
      return passengers;
    }
  
    public int getComfortLevel() {
      return comfortLevel;
    }
  
    public double getFuelEfficiency() {
      return fuelEfficiency;
    }
  
    public Amenities getAmenities() {
      return amenities;
    }
  
    // Mutators (setters)
    public void setSpeed(int speed) {
      this.speed = speed;
    }
  
    public void setCapacity(int capacity) {
      this.capacity = capacity;
    }
  
    public void setPassengers(int passengers) {
      this.passengers = passengers;
    }
  
    public void setComfortLevel(int comfortLevel) {
      this.comfortLevel = comfortLevel;
    }
  
    public void setFuelEfficiency(double fuelEfficiency) {
      this.fuelEfficiency = fuelEfficiency;
    }
  
    public void setAmenities(Amenities amenities) {
      this.amenities = amenities;
    }
  
    // --- Behavior methods ---
  
    /**
     * Makes the trolley move and increase its speed.
     */
    public void move() {
      speed += 10;
      System.out.println("The trolley starts moving at " + speed + " mph.");
    }
  
    /**
     * Stops the trolley and sets speed to zero.
     */
    public void stop() {
      speed = 0;
      System.out.println("The trolley has stopped.");
    }
  
    /**
     * Turns the trolley in the specified direction.
     * @param direction the direction to turn (e.g., "left" or "right")
     */
    public void turn(String direction) {
      System.out.println("The trolley turns " + direction + ".");
    }
  
    /**
     * Loads passengers onto the trolley.
     * @param newPassengers number of passengers boarding
     */
    public void loadPassengers(int newPassengers) {
      if (passengers + newPassengers <= capacity) {
        passengers += newPassengers;
        System.out.println(newPassengers + " passengers boarded. Total: " + passengers);
      } else {
        System.out.println("Not enough space! Only " + (capacity - passengers) + " more can board.");
      }
    }
  
    /**
     * Returns a description of the trolley.
     */
    @Override
    public String toString() {
      return "Trolley [Speed=" + speed +
             " mph, Capacity=" + capacity +
             ", Passengers=" + passengers +
             ", Comfort=" + comfortLevel + "/10" +
             ", MPG=" + fuelEfficiency +
             ", " + amenities + "]";
    }
  }