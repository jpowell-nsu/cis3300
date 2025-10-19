package driver;

public class Driver {

	public static void main(String[] args) {
		
		// This is an example adapted from ChatGPT. When using generated code, 
		// always ask yourself first, "is it correct."
		
        String[] numbers = {"10", "0", null, "abc"};
               
        for(String number : numbers) {
            try {
                
            	// Attempting to parse the string to an integer
            	if(number == null) {
            		throw new NullPointerException();
            	}
                int result = 100 / Integer.parseInt(number);       
                System.out.println("Result: " + result);           
                
            } catch(ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            } catch(NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } catch(NullPointerException e) {
                System.out.println("Error: Null value encountered.");
            }

        }
	}

}
