
//Java program to find number of digits in an integer
import java.util.Scanner;
class Main{	
public static void main(String[] args)
	{
		int number = 12345;
		int digit = 0;
		while(number != 0)
		{
			int pick_last = number % 10;
			digit++;
			number = number / 10;
		}

		System.out.print("Number of Digits = "+digit);

	}
}