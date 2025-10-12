package company;

public class Staff extends Employee {

	private String managerName;

	public Staff() {
		super();
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
		System.out.printf(", %s", managerName);
	}
	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}
