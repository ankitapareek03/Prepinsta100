//Find the Factors of a Number in Java Language
import java.util.Scanner;

class Main {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
	    for(int i =2; i < num; i++) {
	    	
	    	while (num%i ==0) {
	    		
	    	    num = num/i;
	    		System.out.println(i +" ");
	    	}
	    }
	    
	} 
	
}
