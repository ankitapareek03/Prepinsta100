//Find the Sum of the Digits of a Number in Java Language
//Method 2: Using Recursion I

import java.util.Scanner;

class Main1 {
	public static void main(String[] args) {

		int num;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbere :");
		num = sc.nextInt();

		System.out.println("Sum of digits is : " + getSum(num, sum));

	}

	static int getSum(int num, int sum) {
		if (num == 0)
			return sum;
		//sum = sum + num % 10;
		sum += num%10;
		return getSum(num / 10, sum);
	}
}