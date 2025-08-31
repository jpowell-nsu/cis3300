package driver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

//Course Resources
//	List of Useful Resource Websites
//	Setting Up OpenCSV

public class Driver {
	
	public static void main(String[] args) throws IOException, CsvException {
		List<String[]> pokemonBlock = new LinkedList<>();
		String filename = "files/pokemon_data.csv";		
		FileReader filereader = new FileReader(filename);
		CSVReader csvreader = new CSVReader(filereader);
		String[] nextRecord;
		int linecount = 0;
		int blocksize = 5;
			
		csvreader.readNext(); // read the header row
		while ((nextRecord = csvreader.readNext()) != null) {
			pokemonBlock.add(nextRecord);
			linecount++;
			if (linecount % blocksize == 0) {
				System.out.println("Processing... ");
				for (String[] line : pokemonBlock) {
					System.out.println(Arrays.toString(line));
				}		
				pokemonBlock.clear();
			}
		} 
		if (!pokemonBlock.isEmpty()) {
			System.out.println("Processing... ");
			for (String[] line : pokemonBlock) {
				System.out.println(Arrays.toString(line));
			}
		}
		csvreader.close();
	}
}
