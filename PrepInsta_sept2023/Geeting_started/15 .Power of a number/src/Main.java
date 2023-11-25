//Find the Power of a Number in Java LanguageFactorial of a Number in Java

import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		
		int num, power;
		int result =1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		System.out.println("Enter power");
		power = sc.nextInt();
		
	    for(int i =1; i < power; i++) {
	    	
	    	//result = result*num;
	    		result *= num;
	    }
	    System.out.println("Factorial is : "+ result);
	} 
	
}
