package company;

public class Card {
	
	private String fullName;       // Format: last name, first name
	private String birthday;	
	private String departmentCode;
	
	public Card(String fullName, String departmentCode, String birthday) {
		this.setFullName(fullName);
		this.setDepartmentCode(departmentCode);
		this.setBirthday(birthday);
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

	@Override
	public String toString() {
		return String.format("CARD %s, %s, %s\n", fullName, birthday, departmentCode);
	}
}
