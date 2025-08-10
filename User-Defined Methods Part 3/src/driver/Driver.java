package driver;

public class Driver {

	public static void main(String[] args) {
		orderDrink("chai tea");
		orderDrink();
		System.out.println("-------------");
		orderDrink("regular coffee", "large");
		orderDrink("expresso", "small", true);
		System.out.println("-------------");
		// we still have to know the parameter order
		orderDrink("large", "regular coffee");
		System.out.println("-------------");
		orderDrink("regular coffee", 3);
		orderDrink(3, "regular coffee");
	}

	public static void orderDrink() {
		System.out.println("Ordering a regular coffee.");
	}	

	public static void orderDrink(String drinkName) {
		System.out.println("Ordering a " + drinkName + ".");
	}
	
	public static void orderDrink(String drinkName, String size) {
		System.out.println("Ordering a " + size + " " + drinkName + ".");
	}
	
//	public static void orderDrink(String size, String drinkName) {
//		System.out.println("Ordering a " + size + " " + drinkName + ".");
//	}
	
	public static void orderDrink(String drinkName, String size, boolean extraShot) {
		String extras = "";
		
		if (extraShot) {
			extras = " with an extra shot";
		}
		System.out.println("Ordering a " + size + " " + drinkName + extras + ".");
	}
	
	public static void orderDrink(String drinkName, boolean extraShot, String size) {
		String extras = "";
		
		if (extraShot) {
			extras = " with an extra shot";
		}
		System.out.println("Ordering a " + size + " " + drinkName + extras + ".");
	}
	
	public static void orderDrink(String drinkName, int quantity) {
		String plural = "";
		
		if (quantity > 1) {
			plural = "s";
		}
		System.out.println("Ordering " + quantity + " " + drinkName + plural + ".");
	}
	
	public static void orderDrink(int quantity, String drinkName) {
		//orderDrink(drinkName, quantity);
		orderDrink(quantity, drinkName);
	}
	
}
