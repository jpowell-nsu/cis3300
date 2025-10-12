package company;

public class Staff {

	private String fullName;       // Format: last name, first name
	private String birthday;	
	private String departmentCode;
	private int    annualSalary;
	private String managerName;

	/*
	public Staff() {
		setFullName("");
		setDepartmentCode("");
		setBirthday("");
		setAnnualSalary(0);
		setManagerName("");
	} 

	public Staff(String fullName, String departmentCode, String birthday,
					int annualSalary, String managerName) {
		this.setFullName(fullName);
		this.setDepartmentCode(departmentCode);
		this.setBirthday(birthday);
		this.setAnnualSalary(annualSalary);
		this.setManagerName(managerName);
		
	} 
*/
	public void printInfo() {
		System.out.printf("%s, %s, %s, %d, %s\n", fullName, departmentCode, birthday, annualSalary, managerName);
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
}
