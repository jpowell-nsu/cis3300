package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("files/data1.txt");
		Scanner scnr = new Scanner(inputfile);
		
		while (scnr.hasNext()) {
			if (scnr.hasNextInt()) {
				int myint = scnr.nextInt();
				System.out.println("Integer");
			} else if (scnr.hasNextDouble()) {
				double mydouble = scnr.nextDouble();
				System.out.println("Double");
			} else {
				String token = scnr.next();
				System.out.println("String");
			}
		}

		/*
		while (scnr.hasNext()) {
			if (scnr.hasNextDouble()) {
				double mydouble = scnr.nextDouble();
				System.out.println("Double");
			} else if (scnr.hasNextInt()) {
				int myint = scnr.nextInt();
				System.out.println("Integer");
			} else {
				String token = scnr.next();
				System.out.println("String");
			}
		}
		*/
		
		scnr.close();
	}
}
