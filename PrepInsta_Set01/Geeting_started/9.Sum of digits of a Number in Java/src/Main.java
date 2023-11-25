//Find the Sum of the Digits of a Number in Java Language
//Method 1: Using Brute Force

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int num;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		num = sc.nextInt();

		while (num != 0) {
			//sum = sum + num % 10;
			sum += num%10;
			num = num / 10;
		}
		System.out.println("Sum of digits : " + sum);

	}
}