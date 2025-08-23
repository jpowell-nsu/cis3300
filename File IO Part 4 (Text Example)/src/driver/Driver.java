package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream finStream;
		Scanner fin;
		FileOutputStream foutStream;
		PrintWriter fout;
		int ID;
		String fname;
		String lname;
		String email;
		double score;
		
		finStream = new FileInputStream("files/scores.txt");
		fin = new Scanner(finStream);	

		foutStream = new FileOutputStream("files/formatted.txt");
		fout = new PrintWriter(foutStream);
		
		fin.nextLine(); // get the header line and throw it away
		while (fin.hasNext()) {
			ID = fin.nextInt();
			fname = fin.next();
			lname = fin.next();
			email = fin.next();
			score = fin.nextDouble();
			fout.printf("%09d %-25s %-25s %6.2f\n", ID, (lname + ", " + fname), email, score);
			//fout.printf("%d,%s,%s,%s,%f\n", ID, lname, fname, email, score);	
		}
		
		fin.close();
		fout.close();
	}
}
