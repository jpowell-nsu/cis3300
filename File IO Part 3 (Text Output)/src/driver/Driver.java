package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException {
		File outfile = new File("files/data1.txt");
		FileOutputStream ofstream = new FileOutputStream(outfile);
		// creates the file if it does not exists and has permissions
		
		// what if you do not want to wipe the file? use true to open in append mode
		//FileOutputStream ofstream = new FileOutputStream(outfile, true);
		
		//ofstream.		// has basic write methods
		PrintWriter pwstream = new PrintWriter(ofstream);
		//pwstream.
		
		pwstream.print("test1");
		pwstream.println("test2");
		pwstream.printf("%s\n", "test3");
		
		pwstream.close(); // very important to close your resources. 

		/*
		ofstream = new FileOutputStream(outfile, true);
		pwstream = new PrintWriter(ofstream);
		pwstream.println("test flush");
		//pwstream.flush();
		
		// this is one reason why closing the stream is vital--it flushes out to file
		pwstream.close();
	
		/*
		Scanner scnr = new Scanner(System.in);
		System.out.print("Press Enter to Continue");
		scnr.nextLine();
		scnr.close();
		 */
	}
}
