package animals;

public class Cat extends Animal {

	public Cat() {
		super("cat");
	}

	@Override
	public void says() {
		System.out.print("goes \"meow\"");
	}
}
