
/*
 * Prime Number Program in Java
 
 * Method 2: Optimization by break condition
  // Time Complexity : O(N)
  // Space Complexity : O(1)
      
 * Method 3: Optimization by n/2 iterations
  // Time Complexity : O(N)
  // Space Complexity : O(1)
      
 * Method 4: Optimization by √n
  // Time Complexity : O(N)
  // Space Complexity : O(1)
  
 */

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int i;
		int num;
		boolean isPrime = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		num = sc.nextInt();

		if (num < 2) {
			isPrime = false;
		} 
		else {
			for (i = 2; i < num; i++) 
			//for (i = 2; i < num/2; i++) 
			//for(i=2; i <= Math.sqrt(num); i++)
			{
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		String result = isPrime ? "Prime" : "not Prime";
		System.out.println("the number " + num + " is : " + result);

	}

}
