package company;

public class Manager {

	private String fullName;       // Format: last name, first name
	private String birthday;	
	private String departmentCode;
	private int    annualSalary;
	private int    numManaged;    // Number of staff managed

	/*
	public Manager() {
		setFullName("");
		setDepartmentCode("");
		setBirthday("");
		setAnnualSalary(0);
		setNumManaged(0);
	} 

	public Manager(String fullName, String departmentCode, String birthday,
					int annualSalary, int numManaged) {
		this.setFullName(fullName);
		this.setDepartmentCode(departmentCode);
		this.setBirthday(birthday);
		this.setAnnualSalary(annualSalary);
		this.setAnnualSalary(numManaged);
	} 
*/
	
	public void printInfo() {
		System.out.printf("%s, %s, %s, %d, %d\n", fullName, departmentCode, birthday, annualSalary, numManaged);
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

	public int getNumManaged() {
		return numManaged;
	}

	public void setNumManaged(int numManaged) {
		this.numManaged = numManaged;
	} 
	
}
