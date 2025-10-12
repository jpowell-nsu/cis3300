package driver;

import company.Card;
import company.Employee;
import company.Manager;
import company.Staff;

public class Driver {

	public static void main(String[] args) {
		Object obj;

		Card card1 = new Card("Michele", "Sales", "03-03-1975");
		Card card2 = new Card("Bob", "Sales", "03-03-1975");
		
		//Employee employee = new Employee();
		Manager manager = new Manager(card1, 70000, 10);
		//Staff staff = new Staff(card2, 50000, "Michele");
		
		// closer look at the effect of casting
		
		Employee emp = manager;
		//emp.
		
		manager.printInfo();
		System.out.println();
		System.out.println(manager);
		
		emp.printInfo();	
		//emp.
		System.out.println();
		System.out.println(emp.toString()); 
		
		obj = manager;
		//obj.
		//obj.printInfo();		
		//System.out.println();
		System.out.println(obj.toString());	
		
		//emp = (Employee) obj;
		//emp.printInfo();
		//System.out.println();
		//manager = (Manager) obj;
		//manager.printInfo();
		
		emp = manager;
		Staff staff = (Staff) emp;
		staff.printInfo();
		staff.toString();
		
	}

}
