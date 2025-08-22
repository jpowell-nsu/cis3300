package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("files/data1.txt");
		Scanner scnr = new Scanner(inputfile);
		
		//inputfile
		//scnr.

		String token;
		int inttoken;
		double doubletoken;
		float floattoken;
		
		token = scnr.next();
		System.out.println(token);
		
		token = scnr.nextLine();
		System.out.println(token);
		
		token = scnr.nextLine();
		System.out.println(token);
		
		token = scnr.next();
		System.out.println(token.charAt(0));
		
		token = scnr.next();
		System.out.println(token);
		
		token = scnr.next();
		System.out.println(token); //"*" vs '*'
		
		//inttoken = scnr.nextInt();
		//System.out.println(inttoken);
		
		token = scnr.next();
		inttoken = Integer.parseInt(token);
		System.out.println(inttoken);
		
		doubletoken = scnr.nextDouble();
		System.out.println(doubletoken);

		floattoken = scnr.nextFloat();
		System.out.println(floattoken);
		
		scnr.close();

		/*
		scnr = new Scanner(inputfile);
		
		while (scnr.hasNext()) {
			token = scnr.next();
			System.out.print(token + " ");
		}
		
		scnr.close();
		 */
	}
}
