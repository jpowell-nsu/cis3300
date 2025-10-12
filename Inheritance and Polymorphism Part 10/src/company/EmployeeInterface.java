package company;

public interface EmployeeInterface { 
	
	public static final int SALARY = 0;

	//public EmployeeInterface() {
	//	
	//}
	
	public void setSalary(int salary);
	
	public int getSalary();
	
	public void printInfo();
	
	//protected void protmethod();
	
	void another();
	
	//private void something();

	private void something() {
		System.out.println("Something");
	};
	
	default void testing() {
		something();
	}
	
}
