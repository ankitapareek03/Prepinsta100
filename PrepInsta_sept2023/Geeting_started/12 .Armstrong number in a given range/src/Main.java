//Armstrong Numbers between Two Intervals using Java

import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first bnumber");
		a = sc.nextInt();
		System.out.println("Enter first bnumber");
		b = sc.nextInt();

		findArmstrong(a, b);
	}

	static void findArmstrong(int a, int b) {
		for (int i = a; i < b; i++) {
			int num = i;
			int sum = 0;

			while (num > 0) {
				int remainder = num % 10;
				sum = sum + (remainder * remainder * remainder);
				num = num / 10;
			}
			if (sum == i) {
				System.out.println(sum);
			}
		}

	}
}
