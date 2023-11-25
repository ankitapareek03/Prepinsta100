
/*
 * Java Program to Check Leap Year or not
 * 
 * Method 1: Using if-else Statements 1
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = sc.nextInt();

		if (year % 400 == 0)
			System.out.println(year + " is a Leap Year");

		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println(year + " is a Leap Year");

		else
			System.out.println(year + " is not a Leap Year");

	}
}