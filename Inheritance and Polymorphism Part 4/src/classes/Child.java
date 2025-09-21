package classes;

public class Child extends Parent {
	
	public static int count = 42;
	public String name = "child";

	public static void showMessage() {
		System.out.println("Child static method");
	}
	
	public void temp() {
		super.count = 73;	// seems to break what I was saying earlier
		this.count = 37;	// but this only works because it is assuming
							// an instantiated Child object, and there
							// must be a way to distinguish between the
							// two static variables
		super.showMessage();
		this.showMessage();
		
		System.out.println(Parent.count + " " + Child.count + " " + name);
		
	}

}
