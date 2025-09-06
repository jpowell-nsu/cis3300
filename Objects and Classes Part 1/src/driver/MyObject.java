package driver;

public class MyObject {
	
	// state (class members, data members, attributes, or fields)
	public int a;	// public variables accessible inside and outside the object
	private int b;	// private variables only accessible inside the object 
	
	// Behavior (methods)
	
	public MyObject() {
		// constructors - public special method for instantiation
		System.out.println("constructor1");
	}
	
	
	public MyObject(int a, int b) {
		// constructors - public special method for instantiation
		System.out.println("constructor2");
		this.a = a;
		this.b = b;
		this.something();
	}

	public int getB() {
		// accessor or getter - public method to retrieve a field's value
		return b;
	}

	public void setB(int b) {
		// mutator or setter = public method to set a field's value
		// notice the use of "this" in this example
		this.b = b;
	}

	public void something() {
		// public methods for interfacing with the object
		System.out.println("public method a " + a);
		System.out.println("public method b " + b);
		another();
	}
	
	private void another() {
		// private helper methods for internal object use
		System.out.println("private method");
	}

}
