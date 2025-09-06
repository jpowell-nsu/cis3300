package driver;

public class Driver {

	public static void main(String[] args) {
		MyObject mine = new MyObject();
		
		mine.a = 42;
		mine.something();
		
		//mine.b = 42;
		mine.setB(42);
		mine.something();
		//mine.another();
	}

}
