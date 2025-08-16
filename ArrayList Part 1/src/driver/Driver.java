package driver;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		// ArrayLists can only use objects, so you have to use the wrapper classes
		
		ArrayList<Integer> values = new ArrayList<>();
		System.out.println(values);
		
		//values.
		
		values.add(1);
		values.add(0, 2);
		values.add(3);
		//values.add(5, 42);
		System.out.println(values);
		System.out.println(values.size());
		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println();
		System.out.println("-------------");
		
		Integer value = values.get(0);
		System.out.println(value);
		System.out.println(values);
		value = values.getFirst();
		System.out.println(value);
		value = values.getLast();
		System.out.println(value);
		System.out.println("-------------");
		
		values.clear();
		System.out.println(values);
		System.out.println("-------------");
		
		for (int i = 0; i < 10; i++) {
			values.add(i);
		}
		System.out.println(values);
		System.out.println("-------------");
		
		values.remove(0);
		System.out.println(values);
		values.removeFirst();
		System.out.println(values);
		values.removeLast();
		System.out.println(values);
		System.out.println("-------------");
		
		values.set(3, 37);
		values.set(0, 42);
		System.out.println(values);
		System.out.println("-------------");
		
		System.out.println(values.contains(42));
		System.out.println(values.indexOf(42));
		System.out.println(values.indexOf(73));
		System.out.println(values.lastIndexOf(42));
		System.out.println(values.isEmpty());
		System.out.println("-------------");
			
		Object[] valuesArray = values.toArray();
		System.out.println(Arrays.toString(valuesArray));
		
		for (int i = 0; i < valuesArray.length; i++) {
			System.out.print(valuesArray[i] + " ");
		}
		
	}

}
