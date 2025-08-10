package driver;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		//int[][] matrix = new int[3][3];
		
		int[][] matrix = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};

		System.out.println("rows: " + matrix.length);
		System.out.println("columns: " + matrix[0].length);
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}		
		System.out.printf("----------------\n");
		// this creates an entirely new array and replaces the other
		matrix = new int[3][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.printf("----------------\n");
		matrix[1][2] = 42;
		matrix[2][3] = 73;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.printf("----------------\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = (row + 1) * (col + 1);
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.printf("----------------\n");
		
		System.out.println(Arrays.toString(matrix));
		System.out.printf("----------------\n");
		
		for (int row = 0; row < matrix.length; row++) {
			System.out.println(Arrays.toString(matrix[row]));
		}
		
		// Challenge:
		//	Write the code that will sum each row of values
		//	Write the code that will sum each column of values
	}

}
