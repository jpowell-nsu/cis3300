package moreclasses;

import classes.BaseClass;
import classes.SubClass1;

public class Another {
	
	public BaseClass bcanother;
	public SubClass1 sc1another;
	public SubClass2 sc2another;
	
	public Another() {
		bcanother = new BaseClass();
		sc1another = new SubClass1();
		sc2another = new SubClass2();
		
		//bcanother.
		
		//sc1another.super.
		
		System.out.println(sc2another.pubnum);
	}

}
