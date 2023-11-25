//Armstrong Number in Java


import java.util.Scanner;

class Main{
	public static void main (String[]args) {
		int num;
		int arm =0;
		int remainder;
		int c;
	
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		c=num;
		while(num>0) {
			
			remainder = num%10;
			arm = (remainder*remainder*remainder)+arm;
			num = num/10;
		}
		if (c == arm)
			System.out.println("Armstrong number");
		else
			System.out.println("not Armstrong number");
	}
	
}