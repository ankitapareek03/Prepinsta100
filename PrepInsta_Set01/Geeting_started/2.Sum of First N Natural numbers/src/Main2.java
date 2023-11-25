/*
Program to Find the Sum of First N Natural Numbers using java

  Method 3 : Using Recursion
  
 Define a Recursive function getSum() which takes the number input as an argument.
Recursively call the function and keep on adding the return statements.
In the main() function initialize the required variables.
Call the Recursive function and print out the returned value.
*/

public class Main2 {
	public static void main(String[] args) {
		int n = 15;
		int sum = getSum(n);

		System.out.println(sum);
	}

	static int getSum(int n) {
		if (n == 0)
			return n;

		return n + getSum(n - 1);
	}
}