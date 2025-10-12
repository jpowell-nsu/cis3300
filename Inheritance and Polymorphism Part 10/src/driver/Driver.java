package driver;

import company.Card;
import company.Employee;
import company.EmployeeInterface;
import company.Manager;
import company.Staff;

public class Driver {

	public static void main(String[] args) {

		Card card1 = new Card("Michele", "Sales", "03-03-1975");
		Card card2 = new Card("Bob", "Sales", "03-03-1975");
		
		Employee	employee = new Employee();
		Manager 	manager = new Manager(card1, 70000, 10);
		Staff 		staff = new Staff(card2, 50000, "Michele");
		
		//EmployeeInterface empinterface = new EmployeeInterface();
		
		EmployeeInterface empinterface = employee;
		
		empinterface = manager;
		
		Manager m = (Manager) empinterface;
		Employee e = (Employee) empinterface;
		
	}

}
