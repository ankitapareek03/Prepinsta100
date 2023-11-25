/*
 * Java Program to Check Leap Year or not
 * 
 * Method 4: Bonus Boolean Method
 */

 import java.util.Scanner;
 
class Main3 {

    public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year :");
		int year = sc.nextInt();
   
                boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
			System.out.println(year + " is not a leap year.");
	}
}
