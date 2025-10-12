package driver;

import company.Card;
import company.Employee;
import company.Manager;
import company.Staff;

public class Driver {

	public static void main(String[] args) {
		Object obj = new Object();
		
		//obj.
		
		System.out.println(obj);
		System.out.println(obj.toString());
		
		Employee employee = new Employee();
	
		Card card1 = new Card("Michele", "Sales", "03-03-1975");
		System.out.println(card1);
		Manager manager = new Manager(card1, 70000, 10);

		Card card2 = new Card("Bob", "Sales", "03-03-1975");
		Staff   staff = new Staff(card2, 50000, "Michele");
		
		//employee.printInfo();
		//System.out.println();
		//manager.printInfo();
		//System.out.println();
		staff.printInfo();
		
		//System.out.println(employee);
		//System.out.println(manager);
		System.out.println(staff);
	}

}
