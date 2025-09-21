package classes;

// exploring public, private, protected, default
// exploring abstract and final
public class BaseClass {

	// exploring public, private, protected, default
	// exploring final

	public int pubnum = 42;
	protected int procnum;
	private int privnum;
	int defnum;
	
	public void setPrivNum(int value) {
		privnum = value;
	}
	
	public void setProcNum(int value) {
		procnum = value;
	}
	
	public void print() {
		System.out.printf("%d %d %d %d\n", pubnum, procnum, privnum, defnum);
	}

}
