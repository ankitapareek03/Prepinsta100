//Factorial of a Number in Java

import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		
		int n;
		int fact =1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
	    
	    for(int i =1; i < n; i++) {
	    	
	    	fact = fact*i;
	    		
	    }
	    System.out.println("Factorial is : "+ fact);
	} 
	
}
