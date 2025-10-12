package company;

public class Staff extends Employee {

	private String managerName;

	public Staff() {
		this.setManagerName("");
	} 

	public Staff(String fullName, String departmentCode, String birthday,
					int annualSalary, String managerName) {
		super(fullName, departmentCode, birthday, annualSalary);
		this.setManagerName(managerName);
	}
	
	public Staff(Card identity, int annualSalary, String managerName) {
		super(identity, annualSalary);
		this.setManagerName(managerName);
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.printf(", %s Staff", managerName);
	}
	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	/*
	@Override
	public String toString() {
		return String.format("%s%s\n", super.toString(), managerName);
	}
	*/
}
