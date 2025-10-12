package driver;

import company.Card;
import company.Employee;
import company.Manager;
import company.Staff;

public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee();
		//Manager manager = new Manager();
		//Staff staff = new Staff();
		
		//Manager manager = new Manager("Michele", "Sales", "03-03-1975", 70000, 10);
		//Staff   staff = new Staff("Bob", "Sales", "03-03-1975", 50000, "Michele");
		
		Card card1 = new Card("Michele", "Sales", "03-03-1975");
		Manager manager = new Manager(card1, 70000, 10);
		Card card2 = new Card("Bob", "Sales", "03-03-1975");
		Staff   staff = new Staff(card2, 50000, "Michele");
		
		employee.printInfo();
		System.out.println();
		manager.printInfo();
		System.out.println();
		staff.printInfo();
		
	    //  manager.printInfo();
	    //  staff.printInfo();
	}

}
