package driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class Driver {
	
	public static void main(String[] args) throws IOException {
		//readPerson();
		//readPeople();
		writePeople();
	}
	
	public static void readPerson() throws IOException {
		FileInputStream file;
		String content;
		JSONObject person;
		JSONArray scoresArray;
		String name;
		int age;
		String email;
		boolean isVerified;
		int[] scores;
		
		file = new FileInputStream("files/person.json");
		content = new String(file.readAllBytes());
		file.close();

		System.out.println(content);
		System.out.println();
		
		person = new JSONObject(content);
		System.out.println(person);
		System.out.println();
	
		name = person.getString("name");
		age = person.getInt("age");
		email = person.getString("email");
		isVerified = person.getBoolean("isVerified");	

		scoresArray = person.getJSONArray("scores");
		scores = new int[scoresArray.length()];
        for (int i = 0; i < scoresArray.length(); i++) {
        	scores[i] = scoresArray.getInt(i);
        }
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Is Verified: " + isVerified);
        System.out.println("Scores: " + Arrays.toString(scores));	
	}
	
	public static void readPeople() throws IOException {
		FileInputStream file;
		String content;
		JSONObject person;
		JSONArray peopleArray;
		JSONArray scoresArray;
		String name;
		int age;
		String email;
		boolean isVerified;	
		int[] scores;
		
		file = new FileInputStream("files/people1.json");
		//file = new FileInputStream("files/people2.json");
		content = new String(file.readAllBytes());
		file.close();
		System.out.println("JSON Contents...");
		System.out.println(content);
		
		peopleArray = new JSONArray(content);
		System.out.println("JSONArray...");
		System.out.println(peopleArray);
		
		for (int i = 0; i < peopleArray.length(); i++) {
			person = peopleArray.getJSONObject(i);
			System.out.println("JSONObject");
			System.out.println(person);
			
			name = person.getString("name");
			age = person.getInt("age");
			email = person.getString("email");
			isVerified = person.getBoolean("isVerified");				
			scoresArray = person.getJSONArray("scores");
			
			scores = new int[scoresArray.length()];
            for (int j = 0; j < scoresArray.length(); j++) {
            	scores[j] = scoresArray.getInt(j);
            }
            System.out.println("Items from Object...");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Is Verified: " + isVerified);
            System.out.println("Scores: " + Arrays.toString(scores));
            System.out.println();
		}		
	}
	
	public static void writePeople() throws IOException {
		FileOutputStream foutStream = new FileOutputStream("files/peopleout.json");
		PrintWriter fout = new PrintWriter(foutStream);
		JSONArray peopleArray = new JSONArray();
		JSONObject person = new JSONObject();
		
		person = new JSONObject();
		person.put("name", "John Doe");
		person.put("age", 30);
		person.put("email", "johndoe@example.com");
		person.put("isVerified", true);
		person.put("scores", new JSONArray(new int[]{85, 90, 78}));
		peopleArray.put(person);		
			
		person = new JSONObject();
		person.put("name", "Jane Smith");
		person.put("age", 27);
		person.put("email", "janesmith@example.com");
		person.put("isVerified", false);
		person.put("scores", new JSONArray(new int[]{92, 88, 95}));
		peopleArray.put(person);
	
		person = new JSONObject();
		person.put("name", "Emily Johnson");
		person.put("age", 35);
		person.put("email", "emilyj@example.com");
		person.put("isVerified", true);
		person.put("scores", new JSONArray(new int[]{75, 80, 85}));
		peopleArray.put(person);
	
		person = new JSONObject();
		person.put("name", "Michael Brown");
		person.put("age", 40);
		person.put("email", "michaelb@example.com");
		person.put("isVerified", false);
		person.put("scores", new JSONArray(new int[]{88, 82, 90}));
		peopleArray.put(person);		
		
		fout.print(peopleArray.toString());
		fout.close();		
	}
	
}
