package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> data = null;
		String infilename = "files/scores.txt";
		String outfilename = "files/scores.csv";
		
		data = input(infilename);
		process(data);
		csvoutput(outfilename, data);
	}	
	
	public static void process(ArrayList<String> data) {
		for (String line : data) {
			System.out.println(line);
		}
		
		for (String line : data) {
			String[] tokens = line.split(" ");
			System.out.println(Arrays.toString(tokens));
		}
		
		for (int i = 0; i < data.size(); i++) {
			String line = data.get(i);
			String newline = line.replaceAll("\\s+", ",");
			data.set(i, newline);
		}
		
		// Regular Expressions in Java - Tutorial
		// https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
	}
	
	public static ArrayList<String> input(String filename) throws FileNotFoundException {
		FileInputStream finStream = new FileInputStream(filename);
		Scanner fin = new Scanner(finStream);	

		ArrayList<String> data = new ArrayList<>();
		while (fin.hasNext()) {
			data.add(fin.nextLine());
		}
		
		fin.close();
		
		return data;
	}
	
	public static void csvoutput(String filename, ArrayList<String> data) throws FileNotFoundException {
		FileOutputStream foutStream = new FileOutputStream(filename);
		PrintWriter fout = new PrintWriter(foutStream);
		
		for (String line : data) {
			fout.println(line);
		}

		fout.close();
	}
	
}
