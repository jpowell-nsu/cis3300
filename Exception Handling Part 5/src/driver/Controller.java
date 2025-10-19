package driver;

import vehicles.InvalidSpeedException;
import vehicles.Vehicle;

public class Controller {
	
    public static void main(String[] args) throws InvalidSpeedException {
    	
        Vehicle car = new Vehicle("Toyota", "Corolla");

 //       try {
            car.setSpeed(350); // Attempt to set an invalid speed
 //       } catch (InvalidSpeedException e) {
 //           System.out.println("Error: " + e.getMessage());
 //       }

        try {
            car.setSpeed(120); // Set a valid speed
            car.displayInfo(); // Display vehicle info with valid speed
        } catch (InvalidSpeedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
