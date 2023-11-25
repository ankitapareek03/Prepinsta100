//Reverse a given number in Java
//Method 1: Using while loop

import java.util.Scanner;

class Main{
	public static void main (String[]args) {
		int num;
		int r;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number :");
	    num = sc.nextInt();
	    
	    while(num>0) {
	    	r = num%10;
	    	num = num/10;
	    	System.out.println(r);
	    	
	    }
		
	}
}