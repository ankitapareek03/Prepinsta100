/*
 * Java Program to Check Leap Year or not
 * 
 * Method 2: Using if-else Statements 2
 */

public class Main1 {

	public static void main(String[] args) {
		int year = 2021;

	     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	       System.out.println (year + " is a Leap Year");

	     else
	         System.out.println (year + " is not a Leap Year");
		
	}

}
