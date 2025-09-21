package driver;

import classes.Child;
import classes.Parent;

public class Driver {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();

		// Access static variables through class names
		System.out.println("Parent.count = " + Parent.count);  // 0
		System.out.println("Child.count = " + Child.count);    // 42
		
		//p.
		//c.
				
		System.out.println("Parent.count = " + p.count);  // 0
		System.out.println("Child.count = " + c.count);    // 42
		
		// Even though static methods can be called via objects, not recommended
		p.showMessage();  // Parent static method
		c.showMessage();  // Child static method
		
		Parent.showMessage();
		Child.showMessage();
		
		c.temp();
    }

}
