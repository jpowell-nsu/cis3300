package driver;

import animals.Dog;

public class Driver {

	public static void main(String[] args) {
		Dog dog;
		
		dog = new Dog("Scooby-Doo", 7);
		System.out.println("The dog is " + dog.getAge());
		//dog.name = "Scooby-Doo";
		//dog.updateAge(7);
		dog.setAge(8);
		dog.talk();	
		
		System.out.println("The dog is " + dog.getAge());
		
		dog.birthday();
		System.out.println("The dog is " + dog.getAge());
		dog.talk("ruh-roh");
		
		Dog dog2 = new Dog("Brian", 5);
		dog2.talk();
		
		Dog dog3 = new Dog("Pluto", 94);
		dog3.talk("G-g-g-gosh!");
		
		something(dog);
		System.out.println("The dog is " + dog.getAge());
		
		Dog dog4 = another();
		dog4.talk();
	}
	
	public static void something(Dog mydog) {
		mydog.setAge(100);
	}
	
	public static Dog another() {
		Dog dog = new Dog("Rolf", 7);
		
		return dog;
	}

}
