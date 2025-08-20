package driver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.exceptions.CsvException;

public class Driver {
	
	public static void main(String[] args) {
		readByLine();
		//readAll(); 
	}
	
	public static void readByLine() {
		try {
			FileReader filereader = new FileReader("files/scores.csv");
			CSVReader csvreader = new CSVReader(filereader);
			String[] nextRecord;
			
			csvreader.readNext();
			while ((nextRecord = csvreader.readNext()) != null) { 
				System.out.println(Arrays.toString(nextRecord));
			} 
			csvreader.close();
			
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
	
	public static void readAll() {
		try {
			FileReader filereader = new FileReader("files/scores.csv");
			CSVReader csvreader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			
			List<String[]> alldata = csvreader.readAll();
			csvreader.close();		
			for (String[] record : alldata) {
				System.out.println(Arrays.toString(record));
			}
			
		} catch (CsvException | IOException e) {
			e.printStackTrace();
		} 
	}
}
