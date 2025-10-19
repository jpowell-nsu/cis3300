package vehicles;

public class Vehicle {
	
    private String make;
    private String model;
    private int speed;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0; // Default speed is 0
    }

    public void setSpeed(int speed) throws InvalidSpeedException {
    	try {	
	        if (speed < 0 || speed > 300) {
	            throw new InvalidSpeedException("Invalid speed: " + speed + ". Speed must be between 0 and 300.");
	        }
    	} catch(InvalidSpeedException e) {
    		System.out.println("TEST");
    		throw e;
    	}
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle Make: " + make + ", Model: " + model + ", Speed: " + speed + " km/h");
    }
}