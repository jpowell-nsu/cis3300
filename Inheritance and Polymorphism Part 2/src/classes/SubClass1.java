package classes;

public class SubClass1 extends BaseClass {
	
	public int pubnum;	// same variable name as base class, but different variable
	
	public void subclass1Method() {
		pubnum = 1;
		
		// this versus super
		System.out.println(this.pubnum);
		System.out.println(super.pubnum);
		
		//privnum = 2;
		this.procnum = 3;
		this.defnum = 4;

		super.pubnum = 0;
		//super.privnum = 0;
		super.procnum = 0;
		super.defnum = 0;		
	}

}
