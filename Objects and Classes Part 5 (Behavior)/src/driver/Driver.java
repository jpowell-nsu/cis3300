package driver;

import animals.Breed;
import animals.Dog;
import animals.Owner;

public class Driver {

	public static void main(String[] args) {
		Dog dog = create();
		dog.print();
		
		process(dog);
		
		dog.print();

		Dog[] dogs = new Dog[3];
		dogs[0] = new Dog("Fido", 2, "brown", "Jason", "555-5555", "Labrador Retriever", "Canada", 4);
		dogs[1] = new Dog("Bowser", 2, "black", "Jason", "555-5555", "Labrador Retriever", "Canada", 4);
		dogs[2] = new Dog("Bowser2", 2, "yellow", "Jason", "555-5555", "Labrador Retriever", "Canada", 4);
		
		printDogs(dogs);

	}
	
	public static Dog create() {
		Dog dog = new Dog("Fido", 2, "brown", "Jason", "555-5555", "Labrador Retriever", "Canada", 4);
		return dog;
	}
	
	public static void process(Dog dog) {
		dog.print();
		
		System.out.println(dog.getName());
	
		dog.listVaccinations();
		
		String[] vaccination = dog.getVaccinations();
		vaccination[0] = "something1";
		vaccination[1] = "something2";
		vaccination[2] = "something3";
		vaccination[3] = "dark side";
		
		dog.listVaccinations();
		
		Breed breed = dog.getBreed();
		System.out.println("TEST" + breed.getName());
		System.out.println(dog.getBreed().getName());		
		
		Owner owner = dog.getOwner();
		owner.setName("Jason Powell");
		
		dog.print();
		
		Owner newowner = new Owner("Jenny", "867-5309");
		dog.setOwner(newowner);
		dog.print();
	}

	public static void printDogs(Dog[] dogarray) {
		/*
		for (int i = 0; i < dogarray.length; i++) {
			dogarray[i].print();
		}
		*/
		
		for (Dog dog : dogarray) {
			dog.print();
		}

	}
}
