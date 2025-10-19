package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scnr = new Scanner(System.in);
		String[][] items;
		
		System.out.print("Enter the number of rows: ");
		int rows = scnr.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int columns = scnr.nextInt();
		
		System.out.print("Enter the file name: ");
		String filename = scnr.next();
		
		scnr.close();
		
		items = new String[rows][columns];
		
		readData(items, filename);
		processData(items);
	}
	
	public static void readData(String[][] items, String filename) throws FileNotFoundException {
		FileInputStream fileStream = new FileInputStream("files/" + filename);
		Scanner fileInput = new Scanner(fileStream); 
		String[] tokens;

		for (int i = 0; fileInput.hasNext(); i++) {
			tokens = fileInput.nextLine().split(",");
			for (int j = 0; j < tokens.length; j++) {
				items[i][j] = tokens[j];
			}
		}
		
		fileInput.close();
	}
	
	public static void processData(String[][] items) {	
		ArrayList<String> firstnames = new ArrayList<>();
		ArrayList<String> lastnames = new ArrayList<>();
		ArrayList<Double> averages = new ArrayList<>();		
		ArrayList<Integer> digits = new ArrayList<>();

		int i = 0;
		int j = 0;
		int k = 0;
		double average = 0;
		int count = 0;
		
		for(i = 0; i < items.length; i++) {
			firstnames.add(items[i][0]);
			lastnames.add(items[i][1]);
			average = 0;
			count = 0;
			for (j = 0; j < items[i].length; j++) {
				for (k = 0; k < items[i][j].length(); k++) {
					if (Character.isDigit(items[i][j].charAt(k))) {
						digits.add(Integer.parseInt(String.valueOf(items[i][j].charAt(k))));
					}
				}
				if (j >= 2) {
					average += Double.parseDouble(items[i][j]);
					count++;
				}
			}
			average = average/count;
			averages.add(average);
		}
		
		System.out.println(firstnames);
		System.out.println(lastnames);
		System.out.println(averages);
		System.out.println(digits);
	}

}
