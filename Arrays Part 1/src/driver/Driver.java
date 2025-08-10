package driver;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[] temperature = {68, 72, 65, 70, 75, 69, 72, 75, 70, 78, 80, 75, 72, 70, 75};
		int highest = temperature[0];
		int lowest =  temperature[0];
		double average = temperature[0];
		
		for (int i = 0; i < temperature.length; i++) {
			System.out.print(temperature[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(temperature));
				
		for (int i = 1; i < temperature.length; i++) {
			if (highest < temperature[i]) {
				highest = temperature[i];
			}
			if (lowest > temperature[i]) {
				lowest = temperature[i];
			}
			average += temperature[i];
		}
		average = average/temperature.length;
		System.out.println("highest = " + highest);
		System.out.println("lowest = " + lowest);
		System.out.println("average = " + average);
	}

}
