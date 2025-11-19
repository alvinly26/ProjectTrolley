/**
 * The TrolleyTester class is used to demonstrate and test the features of
 * the Trolley and Amenities classes. It creates trolley objects, tests their
 * behaviors, and prints the results to the console.
 *
 * This class is intended for simple demonstration and debugging.
 *
 * @author A1vin Ly
 * @author Github Copilot
 * @author chatGPT
 */
public class TrolleyTester {
    public static void main(String[] args) {
        System.out.println("=== Trolley System Demo ===\n");

        // Create a default trolley
        Trolley defaultTrolley = new Trolley();
        System.out.println("Default Trolley:");
        System.out.println(defaultTrolley);
        System.out.println();

        // Create a custom trolley with all parameters
        Amenities luxuryAmenities = new Amenities(true, true, true);
        Trolley luxuryTrolley = new Trolley(120, 50, 30, 9, 12.5, luxuryAmenities);
        System.out.println("Luxury Trolley:");
        System.out.println(luxuryTrolley);
        System.out.println();

        // Test behavior methods
        System.out.println("--- Testing Trolley Methods ---");
        luxuryTrolley.move();
        luxuryTrolley.move();
        luxuryTrolley.turn("left");
        luxuryTrolley.loadPassengers(25);
        luxuryTrolley.loadPassengers(10);
        luxuryTrolley.loadPassengers(20); // This should exceed capacity
        luxuryTrolley.stop();
        System.out.println();

        // Test getters and setters
        System.out.println("--- Testing Getters and Setters ---");
        System.out.println("Current speed: " + luxuryTrolley.getSpeed());
        System.out.println("Current passengers: " + luxuryTrolley.getPassengers());
        System.out.println("Fuel efficiency: " + luxuryTrolley.getFuelEfficiency());
        System.out.println();

        // Update comfort level
        luxuryTrolley.setComfortLevel(10);
        System.out.println("Updated comfort level to 10/10");
        System.out.println(luxuryTrolley);
    }
}
