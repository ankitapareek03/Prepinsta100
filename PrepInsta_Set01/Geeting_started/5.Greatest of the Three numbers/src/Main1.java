/*
 * Find the Greatest Number Among Three Numbers in Java
 * 
 * Method 2: Using if-else Statements 2
 */

public class Main1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30;

	    if ((num1 >= num2) && (num1 >= num3))
	        System.out.println (num1 + " is the greatest");
	    
	    else if (num2 >= num1 && num2 >= num3)
	        System.out.println (num2 + " is the greatest");

	    else
	        System.out.println (num3 + " is the greatest");
		
	}

}
