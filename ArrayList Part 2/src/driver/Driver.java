package driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name;
		
		ArrayList<String> Andor = new ArrayList<>();
		
		Andor.add("Cassian Andor");
		Andor.add("Luthen Rael");
		Andor.add("Mon Mothma");
		Andor.add("Kleya Marki");
		Andor.add("Dedra Meero");
		Andor.add("Syril Karn");
		
		System.out.println(Andor);
		
		System.out.print("Name? ");
		name = scnr.nextLine();
		scnr.close();
		
		System.out.println(Andor.contains(name));
		System.out.println("-------------");
		
		Andor.sort(null);
		System.out.println(Andor);
		System.out.println("-------------");
		
		name = Andor.get(2);
		System.out.println(name.length());
		System.out.println("-------------");
		
		for (int i = 0; i < Andor.size(); i++) {
			name = Andor.get(i);
			System.out.println(name + " " + name.charAt(0));
		}
		System.out.println("-------------");
		
		for (String tempname : Andor) {
			System.out.println(tempname + " " + tempname.length());
		}
		System.out.println("-------------");
		
		System.out.println(Andor.get(1).contains("ee"));
		System.out.println("-------------");
		
		for (int i = 0; i < Andor.size(); i++) {
			System.out.println(Andor.get(i).contains("ar"));
		}
		
		Object[] AndorArray = Andor.toArray();

		System.out.println(Arrays.toString(AndorArray));
	}

}
