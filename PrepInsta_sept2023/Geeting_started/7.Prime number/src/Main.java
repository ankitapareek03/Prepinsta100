/*
 * Prime Number Program in Java
 * 
 *Method 1: Simple iterative solution
 *
 *If the count of factors for this number is > 2 then
 It’s not prime else it’s prime
 A prime number must only be divisible by 1 and the number itself.
 */

// Time Complexity : O(N)
// Space Complexity : O(1)
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int num, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}

}