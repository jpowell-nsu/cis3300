package company;

public class Employee {
	
	protected Card 	identity;
	protected int   annualSalary;
	
	public Employee() {
		this("", "", "", 0);
	}
	
	public Employee(String fullName, String departmentCode, String birthday, int annualSalary) {
		this.identity = new Card(fullName, departmentCode, birthday);
		this.setAnnualSalary(annualSalary);
	}
	
	public Employee(Card identity, int annualSalary) {
		this.identity = identity;
		this.setAnnualSalary(annualSalary);
	}
	
	public void printInfo() {
		System.out.printf("Employee %s, %s, %s, %d", identity.getFullName(), 
				identity.getDepartmentCode(), identity.getBirthday(), annualSalary);
	}
	
	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	@Override
	public String toString() {
		return String.format("EMPLOYEE %s%d\n", identity, annualSalary);
	}
} 
