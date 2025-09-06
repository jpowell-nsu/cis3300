package animals;

import java.util.Arrays;

public class Dog {
	
	private String name;
	protected int age;
	String color;
	private Owner owner;
	private Breed breed;
	private String[] vaccinations;

	public Dog(String name, int age, String color, 
				String owner, String phonenumber, 
				String breedname, String breedorigin, int vaccineCount) {
		this.name = name;
		this.age = age;
		this.color = color;
		// vaccination
		this.vaccinations = new String[vaccineCount];
		
		// owner
		this.owner = new Owner(owner, phonenumber);
		
		// breed
		this.breed = new Breed(breedname, breedorigin);
		//this.breed.
		
	}
	
	public Dog(String name, int age, Owner owner, Breed breed, String[] vaccinations) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.breed = breed;
		this.vaccinations = vaccinations;
	}

	public void bark() {
		System.out.println(name + " says: Woof!");
	}

	public void listVaccinations() {
		System.out.println(name + "'s Vaccinations:");
		for (String v : vaccinations) {
			System.out.println(" - " + v);
		}
	}
	
    public void print() {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(owner.getName());
    	System.out.println(owner.getPhoneNumber());
    	System.out.println(breed.getName());
    	System.out.println(breed.getOrigin());
    	System.out.println(Arrays.toString(vaccinations));
    }

}
