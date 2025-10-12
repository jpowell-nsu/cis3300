package company;

public class Manager extends Employee {

	private int numManaged;    // Number of staff managed

	public Manager() {
		this.setNumManaged(0);
	}
	
	public Manager(String fullName, String departmentCode, String birthday,
					int annualSalary, int numManaged) {
		super(fullName, departmentCode, birthday, annualSalary);
		this.setNumManaged(numManaged);
	} 
	
	public Manager(Card identity, int annualSalary, int numManaged) {
		super(identity, annualSalary);
		this.setNumManaged(numManaged);
	}

	public void printInfo() {
		super.printInfo();
		System.out.printf(", %d Manager", numManaged);
	}
	
	public int getNumManaged() {
		return numManaged;
	}

	public void setNumManaged(int numManaged) {
		this.numManaged = numManaged;
	} 
	
	/*
	@Override
	public String toString() {
		return String.format("%s%d\n", super.toString(), numManaged);
	}
	*/
}
