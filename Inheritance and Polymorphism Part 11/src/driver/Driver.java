package driver;

import animals.*;

public class Driver {

	public static void main(String[] args) {
		Dog 	dog = new Dog();
		Animal	cat = new Cat();
		Animal	bird = new Bird();
		Animal	mouse = new Mouse();
		Animal	cow = new Cow();
		Animal	frog = new Frog();
		Animal	elephant = new Elephant();
		Animal	duck = new Duck();
		Animal	fish = new Fish();
		Animal	seal = new Seal();
		Animal	fox = new Fox();
	
		Animal[] animals = new Animal[11];
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = bird;
		animals[3] = mouse;
		animals[4] = cow;
		animals[5] = frog;
		animals[6] = elephant;
		animals[7] = duck;
		animals[8] = fish;
		animals[9] = seal;
		animals[10] = fox;
		
		System.out.println(animals[1].getClass().toString());

		for(int i = 0; i < 10; i++) {
			
			// unnecessary and could be susceptible to bad programming or hacking
			//if(animals[i].name.equals("mouse") || animals[i].name.equals("fish")) {

			// too complicated and could be susceptible to bad programming or hacking
			//if(animals[i].getClass().toString().equals("class animals.Mouse")
			//		|| animals[i].getClass().toString().equals("class animals.Fish")){
			
			// least complicated, less susceptible to bad programming or hacking
			//	and instanceof also checks for null.
			if(animals[i] instanceof Mouse || animals[i] instanceof Fish) {
				System.out.print("and ");
			}
			else if(animals[i] instanceof Elephant || animals[i] instanceof Seal) {
				System.out.print("and the ");
			}
			System.out.print(animals[i].name + " ");
			animals[i].says();
			System.out.println();
		}
		System.out.println();
		System.out.println("But there's one sound\r\n" + 
				"That no one knows\r\n" + 
				"What does the fox say?");
		System.out.println();
		
		animals[10].says();
		System.out.println();
		System.out.println("What the fox say");
		System.out.println();
		
		// need to cast the animal as a fox to use the methods
		//animals[10].says(0);
		
		Fox theFox = (Fox) animals[10];
		
		theFox.says(0);
		System.out.println();
		System.out.println("What the fox say");	
		System.out.println();
		
		theFox.says('A');
		System.out.println();
		System.out.println("What the fox say");	
		System.out.println();
		
		theFox.says(true);
		System.out.println();
		System.out.println("What the fox say");	
		System.out.println();
		
		theFox.says("\"Jacha-chacha-chacha-chow!\r\n" + 
				"Chacha-chacha-chacha-chow!\r\n" + 
				"Chacha-chacha-chacha-chow!\"");
		System.out.println();
		System.out.println("What the fox say");	
		System.out.println();		

	}

}
