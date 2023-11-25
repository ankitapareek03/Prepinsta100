//Find the Sum of the Digits of a Number in Java Language
//Method 3: Using Recursion II

import java.util.Scanner;

class Main3 {
	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbere :");
		num = sc.nextInt();

		  System.out.println ("Sum of digits : " + getSum (num));
	   }

	   static int getSum (int num)
	   {

	     if (num == 0)
	       return 0;

	     return (num % 10) + getSum (num / 10);
	   }
}