package driver;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] scores = new int[5][];	// instantiated the number of rows, but not the array per row
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		//scores[0][0] = 42;
		System.out.println("------------------------");
		
		scores[0] = new int[5];	// instantiate the array as row 0
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		for (int j = 0; j < scores[0].length; j++) {
			System.out.print(scores[0][j] + " ");
		}
		
		System.out.println();
		scores[0][0] = 42;
		//scores[1][0] = 73;	// cannot access the second row (row 1)
		//scores[0][6] = 42;
		System.out.println("------------------------");
		
		// instantiate the next three rows
		scores[1] = new int[7];
		scores[2] = new int[3];
		scores[3] = new int[10];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
		System.out.println("------------------------");
		// instantiate the last row, but with no elements?
		if (scores[4] == null) {
			scores[4] = new int[0];
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
		//scores[4][0] = 73;
		System.out.println("------------------------");
		
		scores[0] = new int[1];	// replaces row 0
		scores[4] = new int[5]; // replaces row 4
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
		System.out.println(scores[0].length);
		System.out.println(scores[2].length);
		System.out.println(scores[4].length);
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = i*j;
			}
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
	}

}
