package driver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.exceptions.CsvException;

// Course Resources 
//		List of Useful Resource Websites
//		Setting Up OpenCSV
//		Setting Up org.json

public class Driver {

	public static void main(String[] args) throws IOException, CsvException {
		String filename = "files/scores.csv";

		readByLine(filename);
		// readAllAndDisplay(filename);
		// List<String[]> students = readAllAndReturn(filename);

		/*
		for (int i = 0; i < students.size(); i++) { String[] line = students.get(i);
			double score = Double.parseDouble(line[4]);
			System.out.printf("%09d %-15s %-15s %-25s %5.2f\n",
				Integer.parseInt(line[0]), line[1], line[2], line[3], score);
		}
		*/
	}

	public static void readByLine(String filename) throws CsvValidationException, IOException {
		FileReader filereader = new FileReader(filename);
		CSVReader csvreader = new CSVReader(filereader);
		String[] nextRecord;

		csvreader.readNext();
		while ((nextRecord = csvreader.readNext()) != null) {
			System.out.println(Arrays.toString(nextRecord));
		}
		csvreader.close();
	}

	public static void readAllAndDisplay(String filename) throws IOException, CsvException {
		FileReader filereader = new FileReader(filename);
		CSVReader csvreader = new CSVReaderBuilder(filereader).withSkipLines(1).build();

		List<String[]> alldata = csvreader.readAll();
		csvreader.close();
		for (String[] record : alldata) {
			System.out.println(Arrays.toString(record));
		}
	}

	public static List<String[]> readAllAndReturn(String filename) throws IOException, CsvException {
		FileReader filereader = new FileReader(filename);
		CSVReader csvreader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
		List<String[]> alldata = csvreader.readAll();
		csvreader.close();

		return alldata;
	}
}
