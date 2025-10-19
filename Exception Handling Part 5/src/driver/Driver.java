package driver;

public class Driver {

	public static void main(String[] args) {
		
		// This is an example adapted from ChatGPT. When using generated code, 
		// always ask yourself first, "is it correct."
		
        String[] numbers = {"10", "0", null, "abc"};
       	process(numbers);    

	}
	
	public static void process(String[] numbers) {

		for(String number : numbers) {
			try {		
            	// Attempting to parse the string to an integer
            	if(number == null) {
            		throw new NullPointerException();
            	}            	
                int result = 100 / Integer.parseInt(number);       
                System.out.println("Result: " + result);
                System.out.printf("%d", number);
		            
			} catch(ArithmeticException | NumberFormatException | NullPointerException e) {
				if(e instanceof ArithmeticException) {
					System.out.println("Error: Cannot divide by zero.");
				} else if(e instanceof NumberFormatException) {
					System.out.println("Error: Invalid number format.");
				} else if(e instanceof NullPointerException) {
					System.out.println("Error: Null value encountered.");
				}      
			} catch(Exception e) {
				System.out.println("Error: General exception encountered.");
			}
		}
	}
}

