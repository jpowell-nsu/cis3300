package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("files/data1.txt");
		Scanner scnr = new Scanner(inputfile);
		int size;
		String[] names;
		double[] scores;
		double average = 0;
		
		size = scnr.nextInt();
		names = new String[size];
		scores = new double[size];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = scnr.next();
			scores[i] = scnr.nextDouble();
		}
		scnr.close();		
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));
		
		System.out.printf("----------------\n");
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-10s%6.2f\n", names[i], scores[i]);
			average += scores[i];
		}
		average /= scores.length;
		System.out.printf("----------------\n");
		System.out.printf("%-10s%6.2f\n", "AVG", average);

	}

}
