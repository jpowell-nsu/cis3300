package driver;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userFt = prompt(scnr, "Enter feet: ");
		int userIn = prompt(scnr, "Enter inches: ");
		scnr.close();		
		
		double centimeters = conversion(userFt, userIn);
		
		output(userFt, userIn, centimeters);
	}

	public static int prompt(Scanner scnr, String prompt) {
		System.out.print(prompt);
		
		return scnr.nextInt();
	}
	
	public static void output(int feet, int inches, double centimeters) {
		System.out.printf("%d ft, %d in = %f cm", feet, inches, centimeters);
	}

	public static double conversion(int feet, int inches) {
		final double CM_PER_IN = 2.54;
		final int IN_PER_FT = 12;
		
		return ((feet * IN_PER_FT) + inches) * CM_PER_IN;	
	}
	
}
