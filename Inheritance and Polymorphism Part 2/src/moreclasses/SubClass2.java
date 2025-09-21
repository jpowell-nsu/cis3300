package moreclasses;

import classes.BaseClass;

public class SubClass2 extends BaseClass {
	
	public int pubnum = 100;
	
	public void subclas2Method() {
		pubnum = 0;
		//privnum = 0;
		procnum = 0;
		//defnum = 0;
		
		super.pubnum = 0;
		//super.privnum = 0;
		super.procnum = 0;
		//super.defnum = 0;
	}

}
