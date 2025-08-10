package driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int x = 21;
		int y = 21;
		int sum;
		String message = "Hello World, Again.";
		String name = "Jason";
		double[] values = {1.0, 2.0, 3.0};
		double[] largerValues;
	
		print();
		
		print(message);
		
		sum = add(x, y);
		System.out.println(sum);
		
		message = manipulation(message, name);
		System.out.println(message);
		
		System.out.println("Before method: " + Arrays.toString(values));
		doubler(values);
		System.out.println("After method: " + Arrays.toString(values));

		largerValues = doubleSize(values);
		System.out.println(Arrays.toString(largerValues));
	}

	public static void print() {
		System.out.println("Hello World");
	}	
	
	public static void print(String message) {
		System.out.println(message);
	}	
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String manipulation(String message, String name) {
		message = message.substring(0, 6) + name;
		
		return message;
	}
	
	public static void doubler(double[] numbers) {
		System.out.println("In method 1: " + Arrays.toString(numbers));
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 2.0;
		}
		System.out.println("In method 2: " + Arrays.toString(numbers));
		
	}
	
	public static double[] doubleSize(double[] numbers) {
		double[] newarray = new double[numbers.length*2];
		
		for(int i = 0; i < numbers.length; i++) {
			newarray[i] = numbers[i];
		}
		
		return newarray;
	}
	
}
