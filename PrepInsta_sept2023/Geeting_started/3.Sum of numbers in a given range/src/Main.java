/*
Find the Sum of the Numbers in a Given Range in Java

Method 1: Using Brute Force

Initialize the required variables.
Initiate a for loop from range [5,10].
Keep adding the value of the iter variable to sum variable.
Print the sum variable.
*/

class Main {
	public static void main(String[]args) {
		int a = 1;
		int b =10;
		int sum =0;
		for (int i = a; i <= b; i++)
			sum = sum+i;
		System.out.println("The number is "+ sum );
	}
}

