/**
 * The Amenities class represents features available in a trolley,
 * such as air conditioning, Wi-Fi, and reclining seats.
 * This class is used within the Trolley class.
 *
 * @author Alvin Ly 
 * @author chatGPT
 */
public class Amenities {
    private boolean airConditioning;
    private boolean wiFi;
    private boolean recliningSeats;
  
    /**
     * Default constructor — creates standard amenities.
     */
    public Amenities() {
      this.airConditioning = true;
      this.wiFi = false;
      this.recliningSeats = false;
    }
  
    /**
     * Overloaded constructor — creates custom amenities.
     *
     * @param airConditioning whether trolley has air conditioning
     * @param wiFi whether trolley has Wi-Fi
     * @param recliningSeats whether trolley has reclining seats
     */
    public Amenities(boolean airConditioning, boolean wiFi, boolean recliningSeats) {
      this.airConditioning = airConditioning;
      this.wiFi = wiFi;
      this.recliningSeats = recliningSeats;
    }
  
    // Accessors
    public boolean isAirConditioned() {
      return airConditioning;
    }
  
    public boolean hasWiFi() {
      return wiFi;
    }
  
    public boolean hasRecliningSeats() {
      return recliningSeats;
    }
  
    // Mutators
    public void setAirConditioning(boolean airConditioning) {
      this.airConditioning = airConditioning;
    }
  
    public void setWiFi(boolean wiFi) {
      this.wiFi = wiFi;
    }
  
    public void setRecliningSeats(boolean recliningSeats) {
      this.recliningSeats = recliningSeats;
    }
  
    /**
     * Returns a string description of the amenities.
     */
    @Override
    public String toString() {
      return "Amenities [AC=" + airConditioning +
             ", WiFi=" + wiFi +
             ", Reclining Seats=" + recliningSeats + "]";
    }
  }