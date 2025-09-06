package driver;

import animals.Breed;
import animals.Dog;
import animals.Owner;

public class Driver {

	public static void main(String[] args) {
		Dog dog;
		
		dog = new Dog("Fido", 2, "brown", "Jason", "555-5555", "Labrador Retriever", "Canada", 3);
		
		dog.print();

		Dog dog1;
		Owner jason = new Owner("Jason Powell", "555-5555");
		Breed mybreed = new Breed("Labrador Retriever", "Canada");
		String[] vaccines = new String[4];
		dog1 = new Dog("Fido2", 3, jason, mybreed, vaccines);
		dog1.print();
		
		//dog1.age = 99;
		//dog1.color = "something";
		
		//dog1.print();
		
		//mybreed.
		//System.out.println(dog1.);
	}

}
