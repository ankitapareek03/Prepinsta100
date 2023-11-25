/*
 * Java Program to print Prime numbers in a given range
 * 
 *Method 1: Using inner loop Range as [2, number-1]
 *
 *We run a loop  to iterate through the number in the given interval.
We check if the number is a prime by checking for factors within the range.
 */

// Time Complexity : O(N)
// Space Complexity : O(1)
import java.util.Scanner;

class Main1 {
	public static void main(String[] args) {
		int lower;
		int upper;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter staring number :");
		lower = sc.nextInt();
		System.out.println("Enter ending number :");
		upper = sc.nextInt();
		
		for (int i = lower; i <= upper; i++)
			if (isPrime(i))
				System.out.println(i);
	}
	static boolean isPrime (int n) {
		int count = 0;
		
		if (n<2)
			return false;
		for (int i =2; i<n; i++) {
			if (n%i ==0)
				return false;
		}
		return true;
	}

}
