package driver;

import company.Card;
import company.Employee;
import company.Manager;
import company.Staff;

public class Driver {

	public static void main(String[] args) {
		Object obj = new Object();
		
		System.out.println(obj);
		
		Card card1 = new Card("Michele", "Sales", "03-03-1975");
		Card card2 = new Card("Bob", "Sales", "03-03-1975");
		System.out.println(card1);
		System.out.println(card2);
		
		Employee employee = new Employee();
		System.out.println(employee);
		
		Manager manager = new Manager(card1, 70000, 10);
		System.out.println(manager);

		Staff staff = new Staff(card2, 50000, "Michele");
		System.out.println(staff);
		
		if(staff instanceof Employee) {
			System.out.println("Staff is an Employee");
		} else {
			System.out.println("Staff is not an Employee");
		}
		
		if(manager instanceof Employee) {
			System.out.println("Manager is an Employee");
		} else {
			System.out.println("Manager is not an Employee");
		}
		
		if(manager instanceof Object) {
			System.out.println("Manager is an Object");
		} else {
			System.out.println("Manager is not an Object");
		}
		
		System.out.println("Employee is a manager? " + (employee instanceof Manager));
		System.out.println("Employee is a staff? " + (employee instanceof Staff));
		//System.out.println("Manager is a staff? " + (manager instanceof Staff));
		//System.out.println("Staff is a manager? " + (staff instanceof Manager));
		//System.out.println("Card is a Employee? " + (card1 instanceof Employee));
		//System.out.println("Card is a Manager? " + (card1 instanceof Manager));
		//System.out.println("Card is a Staff? " + (card1 instanceof Staff));
		
		System.out.println("Card is an Object? " + (card1 instanceof Object));
		System.out.println("Employee is an Object? " + (employee instanceof Object));
		System.out.println("Manager is an Object? " + (manager instanceof Object));
		System.out.println("Staff is an Object? " + (staff instanceof Object));
			
		Object object;
		Employee emp;
		Manager man;
		Staff sta;
		
		// casting up the hierarchy
		emp = manager;		// emp = (Employee) manager;
		//emp = staff;		// sta = (Employee) staff
		//object = employee; 	// object = (Object) employee
		//object = manager;	// object = (Object) manager
		
		
		//manager.
		//emp.
		//employee.
		
		object = employee; 			// casting up
		//object.
		//emp = object;
		emp = (Employee) object; 	// casting down
		//emp.
		
		object = manager; 			// casting up
		man = (Manager) object;		// casting down
		
		emp = (Employee) manager;	// casting up (manager becomes an employee)
		sta = (Staff) emp;			// casting down (manager becomes a staff)
		
		object = (Object) manager;	// casting up (manager becomes an object)
		sta = (Staff) object;		// casting down (manager becomes an staff)
		
		object = card1;				// casting up (card becomes an object)
		sta = (Staff) object;		// casting down (card becomes an staff)

	}

}
