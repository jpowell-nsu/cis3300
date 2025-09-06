package driver;

import java.util.Scanner;

import animals.Dog;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name;
		
		System.out.print("name 1: ");
		name = scnr.next();
		
		Dog dog1 = new Dog(name, 3);
		
		System.out.print("name 2: ");
		name = scnr.next();
				
		Dog dog2 = new Dog(name, 3);
		scnr.close();
		
		Dog dog3 = dog1;
		
		System.out.println(dog1.equals(dog2));
		
		System.out.println("dog1 id: " + dog1.toString());
		System.out.println("dog1 id hash: " + dog1.hashCode());
		System.out.println("dog1 id system: " + System.identityHashCode(dog1));
		System.out.println("dog1 id hash hex: " + Integer.toHexString(dog1.hashCode()));
		
		System.out.println("dog2 id: " + dog2);
		System.out.println("dog2 id hash: " + dog2.hashCode());
		System.out.println("dog2 id system: " + System.identityHashCode(dog2));
		System.out.println("dog2 id hash hex: " + Integer.toHexString(dog2.hashCode()));
		
		if (dog1 == dog2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		if (dog1 == dog3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		System.out.println(dog1.name.hashCode());
		System.out.println(dog2.name.hashCode());
		System.out.println(System.identityHashCode(dog1.name));
		System.out.println(System.identityHashCode(dog2.name));
		
		if (dog1.name == dog2.name && dog1.age == dog2.age) {
			// but this is incorrect! == is comparing the string identities, not the string value
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if (dog1.name.equals(dog2.name) && dog1.age == dog2.age) {
			// now it correctly matches it on values
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
