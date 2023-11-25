//Find the Fibonacci Series up to Nth Term in Java Language

import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		int n1 = 0; 
		int n2 =1;
		int n;
		int sum =0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the N");
		n = sc.nextInt();
	    System.out.print(n1+" "+n2);
	    
	    for(int i =2; i < n; i++) {
	    	sum = n1 + n2;
	    	System.out.print(" "+sum);
	    	n1 = n2;
	    	n2 = sum;
	    	
	    		
	    }
	} 
	
}
