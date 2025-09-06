package driver;

import animals.Dog;

public class Driver {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.talk();
		dog1.age();
		
		
		Dog dog2 = new Dog("Scooby-Doo", 7);
		
		dog2.talk();
		dog2.age();
		
		Dog dog3 = new Dog("Scooby-Doo", 7, "brown");
		
		dog3.talk();
		dog3.age();
		
	}

}
