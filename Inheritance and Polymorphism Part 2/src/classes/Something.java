package classes;

import moreclasses.SubClass2;

public class Something {
	
	public BaseClass bc;	// has-a
	public SubClass1 sc1;	// has-a
	public SubClass2 sc2;	// has-a
	
	public Something() {
		bc = new BaseClass();
		sc1 = new SubClass1();
		sc2 = new SubClass2();
		
		//bc.
		
		//sc1.
		
		//sc2.
	}

}
