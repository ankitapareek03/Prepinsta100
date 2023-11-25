/*
 * Java Program to Find Greatest of Two Numbers
 * 
 * Method 2: Using Ternary Operator
 */

public class Main1 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 12;
		int temp;
		
		if (num1 == num2)
			System.out.println("Both are equal");
		else
		{
			temp = num1 > num2 ? num1 : num2;
			System.out.println(temp + " is greater");
		}
		
	}

}
