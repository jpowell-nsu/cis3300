package company;

public class Employee {
	
	protected Card 	identity;
	protected int   annualSalary;
	
	public Employee() {
		this("", "", "", 0);
		//System.out.println("Employee()");
	}
	
	public Employee(String fullName, String departmentCode, String birthday, int annualSalary) {
		//System.out.println("Employee(parameters)");
		this.identity = new Card(fullName, departmentCode, birthday);
		this.setAnnualSalary(annualSalary);
	}
	
	public Employee(Card identity, int annualSalary) {
		this.identity = identity;
		this.setAnnualSalary(annualSalary);
	}
	
	public void printInfo() {
		System.out.printf("%s, %s, %s, %d", identity.getFullName(), 
				identity.getDepartmentCode(), identity.getBirthday(), annualSalary);
	}
	
	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
} 
