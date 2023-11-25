//Check Whether or Not the Number is a Palindrome in Java Language


import java.util.Scanner;

class Main{
	public static void main(String[]args) {
		int n, c, r, s=0;
		
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c=n;
		while(n>0) {
			r = n%10;
			s = (s*10)+r;
			n = n/10;
			}
		
		if (c == s)
			System.out.println("Palindrome number");
		else 
			System.out.println("not Palindrome number");
	}
	
}
