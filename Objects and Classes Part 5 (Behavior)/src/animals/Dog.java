package animals;

import java.util.Arrays;

public class Dog {
	
	private String name;
	private int age;
	private String color;
	private Owner owner;
	private Breed breed;
	private String[] vaccinations;

	public Dog(String name, int age, String color, 
				String owner, String phonenumber, 
				String breedname, String breedorigin, int vaccineCount) {
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
		this.vaccinations = new String[vaccineCount];
		this.owner = new Owner(owner, phonenumber);
		this.breed = new Breed(breedname, breedorigin);
	
	}
	
	public Dog(String name, int age, Owner owner, Breed breed, String[] vaccinations) {
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
		this.setBreed(breed);
		this.setOwner(owner);
		this.setVaccinations(vaccinations);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getVaccinations() {
		return vaccinations;
	}

	public void setVaccinations(String[] vaccinations) {
		this.vaccinations = vaccinations;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
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
